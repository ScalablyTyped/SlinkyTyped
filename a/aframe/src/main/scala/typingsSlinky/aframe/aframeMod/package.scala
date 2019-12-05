package typingsSlinky.aframe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object aframeMod {
  import org.scalablytyped.runtime.StringDictionary
  import org.scalajs.dom.raw.Event
  import typingsSlinky.aframe.Anon_Detail
  import typingsSlinky.std.Partial
  import typingsSlinky.std.ThisType

  type ComponentDefinition[T /* <: js.Object */] = T with (Partial[Component[_, System[_]]]) with (ThisType[T with (Component[_, System[_]])])
  type DetailEvent[D] = Event with Anon_Detail[D]
  type GeometryDefinition[T /* <: js.Object */, U] = T with Partial[Geometry[U]]
  type MultiPropertySchema[T /* <: js.Object */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: aframe.aframe.SinglePropertySchema<T[P]> | T[P]}
    */ typingsSlinky.aframe.aframeStrings.MultiPropertySchema with js.Any
  type NodeDefinition[T /* <: js.Object */] = T with Partial[ANode]
  type ObjectMap[T] = StringDictionary[T]
  type Schema[T /* <: js.Object */] = SinglePropertySchema[T] | MultiPropertySchema[T]
  type ShaderDefinition[T /* <: js.Object */] = T with Partial[Shader]
  type SystemDefinition[T /* <: js.Object */] = T with Partial[System[_]]
}
