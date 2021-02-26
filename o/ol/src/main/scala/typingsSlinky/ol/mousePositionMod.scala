package typingsSlinky.ol

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.MouseEvent
import typingsSlinky.ol.coordinateMod.Coordinate
import typingsSlinky.ol.coordinateMod.CoordinateFormat
import typingsSlinky.ol.eventsMod.EventsKey
import typingsSlinky.ol.objectMod.ObjectEvent
import typingsSlinky.ol.olStrings.changeColoncoordinateFormat
import typingsSlinky.ol.olStrings.changeColonprojection
import typingsSlinky.ol.projMod.ProjectionLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mousePositionMod {
  
  @JSImport("ol/control/MousePosition", JSImport.Default)
  @js.native
  class default () extends MousePosition {
    def this(opt_options: Options) = this()
  }
  
  @js.native
  trait MousePosition
    extends typingsSlinky.ol.controlControlMod.default {
    
    /**
      * Return the coordinate format type used to render the current position or
      * undefined.
      */
    def getCoordinateFormat(): js.UndefOr[CoordinateFormat] = js.native
    
    /**
      * Return the projection that is used to report the mouse position.
      */
    def getProjection(): js.UndefOr[typingsSlinky.ol.projectionMod.default] = js.native
    
    /* protected */ def handleMouseMove(event: MouseEvent): Unit = js.native
    
    /* protected */ def handleMouseOut(event: Event): Unit = js.native
    
    @JSName("on")
    def on_changecoordinateFormat(`type`: changeColoncoordinateFormat, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
    @JSName("on")
    def on_changeprojection(`type`: changeColonprojection, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
    
    @JSName("once")
    def once_changecoordinateFormat(`type`: changeColoncoordinateFormat, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
    @JSName("once")
    def once_changeprojection(`type`: changeColonprojection, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
    
    /**
      * Set the coordinate format type used to render the current position.
      */
    def setCoordinateFormat(format: CoordinateFormat): Unit = js.native
    
    /**
      * Set the projection that is used to report the mouse position.
      */
    def setProjection(projection: ProjectionLike): Unit = js.native
    
    @JSName("un")
    def un_changecoordinateFormat(`type`: changeColoncoordinateFormat, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
    @JSName("un")
    def un_changeprojection(`type`: changeColonprojection, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
  }
  
  @js.native
  trait Options extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var coordinateFormat: js.UndefOr[CoordinateFormat] = js.native
    
    var projection: js.UndefOr[ProjectionLike] = js.native
    
    var render: js.UndefOr[js.Function1[/* p0 */ typingsSlinky.ol.mapEventMod.default, Unit]] = js.native
    
    var target: js.UndefOr[HTMLElement | String] = js.native
    
    var undefinedHTML: js.UndefOr[String] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setCoordinateFormat(value: /* p0 */ js.UndefOr[Coordinate] => String): Self = StObject.set(x, "coordinateFormat", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCoordinateFormatUndefined: Self = StObject.set(x, "coordinateFormat", js.undefined)
      
      @scala.inline
      def setProjection(value: ProjectionLike): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
      
      @scala.inline
      def setRender(value: /* p0 */ typingsSlinky.ol.mapEventMod.default => Unit): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
      
      @scala.inline
      def setTarget(value: HTMLElement | String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetHTMLElement(value: HTMLElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setUndefinedHTML(value: String): Self = StObject.set(x, "undefinedHTML", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUndefinedHTMLUndefined: Self = StObject.set(x, "undefinedHTML", js.undefined)
    }
  }
}
