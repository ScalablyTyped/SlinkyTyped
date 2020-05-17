package typingsSlinky.inputmask

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type DefinitionValidator = js.Function5[
    /* chrs */ java.lang.String, 
    /* buffer */ js.Array[java.lang.String], 
    /* pos */ scala.Double, 
    /* strict */ scala.Boolean, 
    /* opts */ typingsSlinky.inputmask.mod.Options, 
    scala.Boolean | typingsSlinky.inputmask.anon.C
  ]
}
