package typingsSlinky.antDashDesignDashPro

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libAuthorizedMod {
  import slinky.core.ReactComponentClass
  import slinky.core.TagMod
  import typingsSlinky.antDashDesignDashPro.libAuthorizedAuthorizedRouteMod.authority

  type IReactComponent[P] = ReactComponentClass[P] | ReactComponentClass[P] | ReactComponentClass[P]
  type Secured = js.Function2[
    /* authority */ authority, 
    /* error */ js.UndefOr[TagMod[Any]], 
    js.Function1[/* target */ IReactComponent[js.Any], IReactComponent[js.Any]]
  ]
  type check = js.Function3[
    /* authority */ authority, 
    /* target */ IReactComponent[js.Any], 
    /* Exception */ IReactComponent[js.Any], 
    IReactComponent[js.Any]
  ]
}
