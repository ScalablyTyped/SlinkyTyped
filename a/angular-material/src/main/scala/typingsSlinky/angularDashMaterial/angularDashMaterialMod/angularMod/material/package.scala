package typingsSlinky.angularDashMaterial.angularDashMaterialMod.angularMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object material {
  import org.scalablytyped.runtime.StringDictionary
  import org.scalajs.dom.raw.Element
  import typingsSlinky.angular.JQuery
  import typingsSlinky.angular.angularMod.IPromise
  import typingsSlinky.angular.angularMod.IScope
  import typingsSlinky.angular.angularMod.Injectable

  type IColorExpression = StringDictionary[String]
  type IIcon = js.Function1[/* id */ String, IPromise[Element]]
  type IMedia = js.Function1[/* media */ String, Boolean]
  type IStickyService = js.Function3[/* scope */ IScope, /* element */ JQuery, /* elementClone */ js.UndefOr[JQuery], Unit]
  type ResolveObject = StringDictionary[Injectable[js.Function1[/* repeated */ js.Any, js.Thenable[js.Any]]]]
}
