package typingsSlinky.revalidate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Comparer = js.Function2[/* a */ js.Any, /* b */ js.Any, scala.Boolean]
  type ComposeConfig = typingsSlinky.revalidate.mod.Config with typingsSlinky.revalidate.mod.Multiple
  type ComposedCurryableValidator = js.Function1[
    /* config */ js.UndefOr[java.lang.String | typingsSlinky.revalidate.mod.ComposeConfig], 
    typingsSlinky.revalidate.mod.ConfiguredValidator
  ]
  type ConfigurableValidator = typingsSlinky.revalidate.mod.UnconfiguredValidator with typingsSlinky.revalidate.mod.CurryableValidator
  type ConfiguredCombinedValidator = js.Function2[/* value */ js.UndefOr[js.Any], /* allValues */ js.UndefOr[js.Any], js.Any]
  type ConfiguredValidator = js.Function2[/* value */ js.UndefOr[js.Any], /* allValues */ js.UndefOr[js.Any], js.Any]
  type CurryableValidator = js.Function1[
    /* config */ js.UndefOr[java.lang.String | typingsSlinky.revalidate.mod.Config], 
    typingsSlinky.revalidate.mod.ConfiguredValidator
  ]
  type MessageCreator = (js.Function1[/* field */ js.Any, js.Any]) | java.lang.String
  type UnconfiguredValidator = js.Function3[
    /* config */ js.UndefOr[java.lang.String | typingsSlinky.revalidate.mod.Config], 
    /* value */ js.UndefOr[js.Any], 
    /* allValues */ js.UndefOr[js.Any], 
    js.Any
  ]
  type Validator = typingsSlinky.revalidate.mod.ConfiguredValidator with typingsSlinky.revalidate.mod.UnconfiguredValidator
  type ValidatorImpl = js.Function1[
    /* message */ js.Any, 
    js.Function2[/* value */ js.Any, /* allValues */ js.UndefOr[js.Any], js.Any]
  ]
}
