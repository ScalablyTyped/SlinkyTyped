package typingsSlinky.node.v8Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A subclass of `Serializer` that serializes `TypedArray` (in particular `Buffer`) and `DataView` objects as host objects,
  * and only stores the part of their underlying `ArrayBuffers` that they are referring to.
  */
@JSImport("v8", "DefaultSerializer")
@js.native
class DefaultSerializer () extends Serializer
