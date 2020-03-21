package typingsSlinky.forms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type FieldIterator = js.Function2[
    /* name */ java.lang.String, 
    /* field */ typingsSlinky.forms.mod.FieldBound, 
    java.lang.String
  ]
  type FormHandleCallback = js.Function1[/* form */ typingsSlinky.forms.mod.Form, scala.Unit]
  type RenderFunction = js.Function2[
    /* name */ java.lang.String, 
    /* field */ typingsSlinky.forms.mod.Field, 
    java.lang.String
  ]
  type ValidatorFunction = js.Function3[
    /* form */ typingsSlinky.forms.mod.FormBound, 
    /* field */ typingsSlinky.forms.mod.FieldBound, 
    /* callback */ js.Function1[/* err */ js.UndefOr[java.lang.String], scala.Unit], 
    scala.Unit
  ]
}
