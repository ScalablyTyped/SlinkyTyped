package typingsSlinky.hyperlorisTyson

import typingsSlinky.hyperlorisTyson.mod.Tyson
import typingsSlinky.hyperlorisTyson.typeAdapterFactoryMod.TypeAdapterFactory
import typingsSlinky.hyperlorisTyson.typeAdapterMod.TypeAdapter
import typingsSlinky.hyperlorisTyson.typeTokenMod.TypeToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@hyperloris/tyson/dist/types/adapters/arrayTypeAdapter", JSImport.Namespace)
@js.native
object arrayTypeAdapterMod extends js.Object {
  @js.native
  class ArrayTypeAdapter protected ()
    extends TypeAdapter[js.Any] {
    def this(tyson: Tyson, typeToken: TypeToken[_]) = this()
    var _typeToken: js.Any = js.native
    var _tyson: js.Any = js.native
    /* private */ def convertSingleOrMultiTypeArray(isFrom: js.Any, inArray: js.Any): js.Any = js.native
  }
  
  /* static members */
  @js.native
  object ArrayTypeAdapter extends js.Object {
    val FACTORY: TypeAdapterFactory = js.native
  }
  
}

