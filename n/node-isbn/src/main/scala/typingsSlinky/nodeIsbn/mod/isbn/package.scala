package typingsSlinky.nodeIsbn.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object isbn {
  
  type ResolveCallback = js.Function2[
    /* error */ js.Error | scala.Null, 
    /* book */ typingsSlinky.nodeIsbn.mod.isbn.Book, 
    scala.Unit
  ]
}
