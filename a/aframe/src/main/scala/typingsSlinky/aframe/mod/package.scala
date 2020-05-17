package typingsSlinky.aframe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ComponentDefinition[T /* <: js.Object */] = T with typingsSlinky.aframe.anon.PartialComponentanySystem with (typingsSlinky.std.ThisType[
    T with (typingsSlinky.aframe.mod.Component[_, typingsSlinky.aframe.mod.System[_]])
  ])
  type GeometryDefinition[T /* <: js.Object */, U] = T with typingsSlinky.std.Partial[typingsSlinky.aframe.mod.Geometry[U]]
  type MultiPropertySchema[T /* <: js.Object */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: aframe.aframe.SinglePropertySchema<T[P]> | T[P]}
    */ typingsSlinky.aframe.aframeStrings.MultiPropertySchema with org.scalablytyped.runtime.TopLevel[js.Any]
  type NodeDefinition[T /* <: js.Object */] = T with typingsSlinky.aframe.anon.PartialANode
  type ObjectMap[T] = org.scalablytyped.runtime.StringDictionary[T]
  type ShaderDefinition[T /* <: js.Object */] = T with typingsSlinky.aframe.anon.PartialShader
  type SystemDefinition[T /* <: js.Object */] = T with typingsSlinky.aframe.anon.PartialSystemany
}
