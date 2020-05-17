package typingsSlinky.reactSketchapp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type LayerCreator = js.Function5[
    /* style */ typingsSlinky.reactSketchapp.typesMod.ViewStyle, 
    /* layout */ typingsSlinky.reactSketchapp.typesMod.LayoutInfo, 
    /* textStyle */ typingsSlinky.reactSketchapp.typesMod.TextStyle, 
    /* props */ js.Any, 
    /* value */ js.UndefOr[java.lang.String], 
    typingsSlinky.reactSketchapp.typesMod.SketchLayer
  ]
  type MSColor = js.Any
  type MSGradient = js.Any
  type NSString = js.Any
  type SketchLayer = js.Any
  type SketchShadows = js.Array[typingsSlinky.reactSketchapp.typesMod.SketchShadow]
  type SketchStyle = js.Any
  type TextNodes = js.Array[typingsSlinky.reactSketchapp.typesMod.TextNode]
}
