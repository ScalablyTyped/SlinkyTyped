package typingsSlinky.ngreact

import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ngreact", JSImport.Namespace)
@js.native
object ngreactMod extends js.Object {
  type ReactDirective = js.Function4[
    /* reactComponentName */ String | ReactComponentClass[js.Any], 
    /* propNames */ js.UndefOr[js.Array[String]], 
    /* conf */ js.UndefOr[js.Object], 
    /* injectableProps */ js.UndefOr[js.Object], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IDirective */ js.Any
  ]
}

