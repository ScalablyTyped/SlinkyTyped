package typingsSlinky.knockout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object utils {
  
  type ArrayChanges[T] = js.Array[typingsSlinky.knockout.mod.utils.ArrayChange[T]]
  
  type MappingAfterAddFunction[T] = js.Function3[
    /* arrayEntry */ T, 
    /* nodes */ js.Array[org.scalajs.dom.raw.Node], 
    /* index */ typingsSlinky.knockout.mod.Observable_[scala.Double], 
    js.Array[org.scalajs.dom.raw.Node]
  ]
  
  type MappingFunction[T] = js.Function3[
    /* valueToMap */ T, 
    /* index */ scala.Double, 
    /* nodes */ js.Array[org.scalajs.dom.raw.Node], 
    js.Array[org.scalajs.dom.raw.Node]
  ]
  
  type MappingHookFunction[T] = js.Function3[
    /* nodes */ js.Array[org.scalajs.dom.raw.Node], 
    /* index */ scala.Double, 
    /* arrayEntry */ T, 
    scala.Unit
  ]
}
