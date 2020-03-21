package typingsSlinky.jqueryAjaxfile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Chai_ {
  type AssertStatic = typingsSlinky.jqueryAjaxfile.Chai_.Assert
  type AssertionStatic = js.Function2[
    /* target */ js.Any, 
    /* message */ js.UndefOr[java.lang.String], 
    typingsSlinky.jqueryAjaxfile.Chai_.Assertion
  ]
  type Equal = js.Function2[
    /* value */ js.Any, 
    /* message */ js.UndefOr[java.lang.String], 
    typingsSlinky.jqueryAjaxfile.Chai_.Assertion
  ]
  type ExpectStatic = typingsSlinky.jqueryAjaxfile.Chai_.AssertionStatic
  type InstanceOf = js.Function2[
    /* constructor */ typingsSlinky.jqueryAjaxfile.Object, 
    /* message */ js.UndefOr[java.lang.String], 
    typingsSlinky.jqueryAjaxfile.Chai_.Assertion
  ]
  type Members = js.Function2[
    /* set */ js.Array[js.Any], 
    /* message */ js.UndefOr[java.lang.String], 
    typingsSlinky.jqueryAjaxfile.Chai_.Assertion
  ]
  type NumberComparer = js.Function2[
    /* value */ scala.Double, 
    /* message */ js.UndefOr[java.lang.String], 
    typingsSlinky.jqueryAjaxfile.Chai_.Assertion
  ]
  type OwnProperty = js.Function2[
    /* name */ java.lang.String, 
    /* message */ js.UndefOr[java.lang.String], 
    typingsSlinky.jqueryAjaxfile.Chai_.Assertion
  ]
  type Property = js.Function3[
    /* name */ java.lang.String, 
    /* value */ js.UndefOr[js.Any], 
    /* message */ js.UndefOr[java.lang.String], 
    typingsSlinky.jqueryAjaxfile.Chai_.Assertion
  ]
}
