package typingsSlinky.jointjs.mod.shapes

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.jointjs.mod.attributes.SVGEllipseAttributes
import typingsSlinky.jointjs.mod.attributes.SVGPolygonAttributes
import typingsSlinky.jointjs.mod.attributes.SVGTextAttributes
import typingsSlinky.jointjs.mod.dia.Cell.Selectors
import typingsSlinky.jointjs.mod.dia.Element
import typingsSlinky.jointjs.mod.dia.Element.GenericAttributes
import typingsSlinky.jointjs.mod.dia.Graph.Options
import typingsSlinky.jointjs.mod.dia.Link
import typingsSlinky.jointjs.mod.dia.Link.Attributes
import typingsSlinky.jointjs.mod.shapes.basic.Generic
import typingsSlinky.jointjs.mod.shapes.basic.PolygonSelectors
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object erd {
  
  @JSImport("jointjs", "shapes.erd.Attribute")
  @js.native
  class Attribute () extends Element {
    def this(attributes: GenericAttributes[EllipsoidSelectors]) = this()
    def this(attributes: js.UndefOr[scala.Nothing], opt: StringDictionary[js.Any]) = this()
    def this(attributes: GenericAttributes[EllipsoidSelectors], opt: StringDictionary[js.Any]) = this()
  }
  
  @JSImport("jointjs", "shapes.erd.Derived")
  @js.native
  class Derived () extends Attribute {
    def this(attributes: GenericAttributes[EllipsoidSelectors]) = this()
    def this(attributes: js.UndefOr[scala.Nothing], opt: StringDictionary[js.Any]) = this()
    def this(attributes: GenericAttributes[EllipsoidSelectors], opt: StringDictionary[js.Any]) = this()
  }
  
  @JSImport("jointjs", "shapes.erd.Entity")
  @js.native
  class Entity () extends Generic {
    def this(attributes: GenericAttributes[PolygonalSelectors]) = this()
    def this(attributes: js.UndefOr[scala.Nothing], opt: StringDictionary[js.Any]) = this()
    def this(attributes: GenericAttributes[PolygonalSelectors], opt: StringDictionary[js.Any]) = this()
  }
  
  @JSImport("jointjs", "shapes.erd.ISA")
  @js.native
  class ISA () extends Element {
    def this(attributes: GenericAttributes[PolygonSelectors]) = this()
    def this(attributes: js.UndefOr[scala.Nothing], opt: StringDictionary[js.Any]) = this()
    def this(attributes: GenericAttributes[PolygonSelectors], opt: StringDictionary[js.Any]) = this()
  }
  
  @JSImport("jointjs", "shapes.erd.IdentifyingRelationship")
  @js.native
  class IdentifyingRelationship () extends Relationship {
    def this(attributes: GenericAttributes[PolygonalSelectors]) = this()
    def this(attributes: js.UndefOr[scala.Nothing], opt: StringDictionary[js.Any]) = this()
    def this(attributes: GenericAttributes[PolygonalSelectors], opt: StringDictionary[js.Any]) = this()
  }
  
  @JSImport("jointjs", "shapes.erd.Key")
  @js.native
  class Key () extends Attribute {
    def this(attributes: GenericAttributes[EllipsoidSelectors]) = this()
    def this(attributes: js.UndefOr[scala.Nothing], opt: StringDictionary[js.Any]) = this()
    def this(attributes: GenericAttributes[EllipsoidSelectors], opt: StringDictionary[js.Any]) = this()
  }
  
  @JSImport("jointjs", "shapes.erd.Line")
  @js.native
  // default label props
  class Line () extends Link {
    def this(attributes: Attributes) = this()
    def this(attributes: js.UndefOr[scala.Nothing], opt: Options) = this()
    def this(attributes: Attributes, opt: Options) = this()
    
    def cardinality(value: String): Unit = js.native
    def cardinality(value: Double): Unit = js.native
  }
  
  @JSImport("jointjs", "shapes.erd.Multivalued")
  @js.native
  class Multivalued () extends Attribute {
    def this(attributes: GenericAttributes[EllipsoidSelectors]) = this()
    def this(attributes: js.UndefOr[scala.Nothing], opt: StringDictionary[js.Any]) = this()
    def this(attributes: GenericAttributes[EllipsoidSelectors], opt: StringDictionary[js.Any]) = this()
  }
  
  @JSImport("jointjs", "shapes.erd.Normal")
  @js.native
  class Normal () extends Attribute {
    def this(attributes: GenericAttributes[EllipsoidSelectors]) = this()
    def this(attributes: js.UndefOr[scala.Nothing], opt: StringDictionary[js.Any]) = this()
    def this(attributes: GenericAttributes[EllipsoidSelectors], opt: StringDictionary[js.Any]) = this()
  }
  
  @JSImport("jointjs", "shapes.erd.Relationship")
  @js.native
  class Relationship () extends Element {
    def this(attributes: GenericAttributes[PolygonalSelectors]) = this()
    def this(attributes: js.UndefOr[scala.Nothing], opt: StringDictionary[js.Any]) = this()
    def this(attributes: GenericAttributes[PolygonalSelectors], opt: StringDictionary[js.Any]) = this()
  }
  
  @JSImport("jointjs", "shapes.erd.WeakEntity")
  @js.native
  class WeakEntity () extends Entity {
    def this(attributes: GenericAttributes[PolygonalSelectors]) = this()
    def this(attributes: js.UndefOr[scala.Nothing], opt: StringDictionary[js.Any]) = this()
    def this(attributes: GenericAttributes[PolygonalSelectors], opt: StringDictionary[js.Any]) = this()
  }
  
  @js.native
  trait EllipsoidSelectors extends Selectors {
    
    @JSName(".body")
    var Dotbody: js.UndefOr[SVGEllipseAttributes] = js.native
    
    @JSName(".label")
    var Dotlabel: js.UndefOr[SVGEllipseAttributes] = js.native
    
    var text: js.UndefOr[SVGTextAttributes] = js.native
  }
  object EllipsoidSelectors {
    
    @scala.inline
    def apply(): EllipsoidSelectors = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EllipsoidSelectors]
    }
    
    @scala.inline
    implicit class EllipsoidSelectorsMutableBuilder[Self <: EllipsoidSelectors] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDotbody(value: SVGEllipseAttributes): Self = StObject.set(x, ".body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDotbodyUndefined: Self = StObject.set(x, ".body", js.undefined)
      
      @scala.inline
      def setDotlabel(value: SVGEllipseAttributes): Self = StObject.set(x, ".label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDotlabelUndefined: Self = StObject.set(x, ".label", js.undefined)
      
      @scala.inline
      def setText(value: SVGTextAttributes): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  @js.native
  trait PolygonalSelectors extends Selectors {
    
    @JSName(".body")
    var Dotbody: js.UndefOr[SVGPolygonAttributes] = js.native
    
    @JSName(".label")
    var Dotlabel: js.UndefOr[SVGPolygonAttributes] = js.native
    
    var text: js.UndefOr[SVGTextAttributes] = js.native
  }
  object PolygonalSelectors {
    
    @scala.inline
    def apply(): PolygonalSelectors = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PolygonalSelectors]
    }
    
    @scala.inline
    implicit class PolygonalSelectorsMutableBuilder[Self <: PolygonalSelectors] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDotbody(value: SVGPolygonAttributes): Self = StObject.set(x, ".body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDotbodyUndefined: Self = StObject.set(x, ".body", js.undefined)
      
      @scala.inline
      def setDotlabel(value: SVGPolygonAttributes): Self = StObject.set(x, ".label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDotlabelUndefined: Self = StObject.set(x, ".label", js.undefined)
      
      @scala.inline
      def setText(value: SVGTextAttributes): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
}
