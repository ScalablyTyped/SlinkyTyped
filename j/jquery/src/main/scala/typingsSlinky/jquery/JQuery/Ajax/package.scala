package typingsSlinky.jquery.JQuery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Ajax {
  type CompleteCallback[TContext] = js.ThisFunction2[
    /* this */ TContext, 
    /* jqXHR */ typingsSlinky.jquery.JQuery.jqXHR[js.Any], 
    /* textStatus */ typingsSlinky.jquery.JQuery.Ajax.TextStatus, 
    scala.Unit
  ]
  type ErrorCallback[TContext] = js.ThisFunction3[
    /* this */ TContext, 
    /* jqXHR */ typingsSlinky.jquery.JQuery.jqXHR[js.Any], 
    /* textStatus */ typingsSlinky.jquery.JQuery.Ajax.ErrorTextStatus, 
    /* errorThrown */ java.lang.String, 
    scala.Unit
  ]
  type SuccessCallback[TContext] = js.ThisFunction3[
    /* this */ TContext, 
    /* data */ js.Any, 
    /* textStatus */ typingsSlinky.jquery.JQuery.Ajax.SuccessTextStatus, 
    /* jqXHR */ typingsSlinky.jquery.JQuery.jqXHR[js.Any], 
    scala.Unit
  ]
}
