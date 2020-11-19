package typingsSlinky.ol

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.ol.eventsMod.EventsKey
import typingsSlinky.ol.objectMod.ObjectEvent
import typingsSlinky.ol.olStrings.changeColongeometry
import typingsSlinky.ol.styleStyleMod.StyleFunction
import typingsSlinky.ol.styleStyleMod.StyleLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ol/Feature", JSImport.Namespace)
@js.native
object olFeatureMod extends js.Object {
  
  def createStyleFunction(obj: js.Array[typingsSlinky.ol.styleStyleMod.default]): StyleFunction = js.native
  def createStyleFunction(obj: StyleFunction): StyleFunction = js.native
  def createStyleFunction(obj: typingsSlinky.ol.styleStyleMod.default): StyleFunction = js.native
  
  @js.native
  trait Feature[GeomType /* <: typingsSlinky.ol.geometryMod.default */]
    extends typingsSlinky.ol.objectMod.default {
    
    def getGeometry(): GeomType = js.native
    
    def getGeometryName(): String = js.native
    
    def getId(): Double | String = js.native
    
    def getStyle(): StyleLike = js.native
    
    def getStyleFunction(): StyleFunction = js.native
    
    @JSName("on")
    def on_changegeometry(`type`: changeColongeometry, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
    
    @JSName("once")
    def once_changegeometry(`type`: changeColongeometry, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
    
    def setGeometry(): Unit = js.native
    def setGeometry(geometry: GeomType): Unit = js.native
    
    def setGeometryName(name: String): Unit = js.native
    
    def setId(): Unit = js.native
    def setId(id: String): Unit = js.native
    def setId(id: Double): Unit = js.native
    
    def setStyle(): Unit = js.native
    def setStyle(style: StyleLike): Unit = js.native
    
    @JSName("un")
    def un_changegeometry(`type`: changeColongeometry, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
  }
  
  @js.native
  class default[GeomType /* <: typingsSlinky.ol.geometryMod.default */] () extends Feature[GeomType] {
    def this(opt_geometryOrProperties: GeomType) = this()
    def this(opt_geometryOrProperties: StringDictionary[js.Any]) = this()
  }
  
  type FeatureClass = Feature[typingsSlinky.ol.geometryMod.default] | typingsSlinky.ol.renderFeatureMod.default
  
  type FeatureLike = Feature[typingsSlinky.ol.geometryMod.default] | typingsSlinky.ol.renderFeatureMod.default
}
