package typingsSlinky.googleProtobuf

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type BinaryRead = js.Function2[
    /* msg */ js.Any, 
    /* reader */ typingsSlinky.googleProtobuf.mod.BinaryReadReader, 
    scala.Unit
  ]
  type BinaryReadReader = js.Function2[
    /* msg */ js.Any, 
    /* binaryReader */ typingsSlinky.googleProtobuf.mod.BinaryReader, 
    scala.Unit
  ]
  type BinaryWrite = js.Function3[
    /* fieldNumber */ scala.Double, 
    /* value */ js.Any, 
    /* writerCallback */ typingsSlinky.googleProtobuf.mod.BinaryWriteCallback, 
    scala.Unit
  ]
  type BinaryWriteCallback = js.Function2[
    /* value */ js.Any, 
    /* binaryWriter */ typingsSlinky.googleProtobuf.mod.BinaryWriter, 
    scala.Unit
  ]
  type Map[K, V] = typingsSlinky.googleProtobuf.mod.Map_[K, V]
  type RepeatedFieldType = js.Array[typingsSlinky.googleProtobuf.mod.ScalarFieldType | js.typedarray.Uint8Array]
}
