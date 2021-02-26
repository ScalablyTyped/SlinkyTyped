package typingsSlinky.googleProtobuf

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AnyFieldType = typingsSlinky.googleProtobuf.mod.ScalarFieldType | typingsSlinky.googleProtobuf.mod.RepeatedFieldType | js.typedarray.Uint8Array
  
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
  
  type ByteSource = js.typedarray.ArrayBuffer | js.typedarray.Uint8Array | js.Array[scala.Double] | java.lang.String
  
  type FieldValue = js.UndefOr[
    java.lang.String | scala.Double | scala.Boolean | js.typedarray.Uint8Array | typingsSlinky.googleProtobuf.mod.FieldValueArray
  ]
  
  type RepeatedFieldType = js.Array[typingsSlinky.googleProtobuf.mod.ScalarFieldType | js.typedarray.Uint8Array]
  
  type ScalarFieldType = scala.Boolean | scala.Double | java.lang.String
}
