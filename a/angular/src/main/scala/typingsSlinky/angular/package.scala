package typingsSlinky

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object angular {
  type JQLiteCssProperties = org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double | typingsSlinky.angular.cssPropertySetter]
  type JQueryStatic = js.Function1[
    /* element */ java.lang.String | org.scalajs.dom.raw.Element | typingsSlinky.std.Document_ | typingsSlinky.std.Window_ | typingsSlinky.angular.JQuery | typingsSlinky.std.ArrayLike[org.scalajs.dom.raw.Element] | js.Function0[scala.Unit], 
    typingsSlinky.angular.JQLite
  ]
  /**
    * The interface used to specify the properties parameter in css()
    */
  // tslint:disable-next-line:class-name
  type cssPropertySetter = js.Function2[
    /* index */ scala.Double, 
    /* value */ js.UndefOr[java.lang.String], 
    java.lang.String | scala.Double
  ]
}
