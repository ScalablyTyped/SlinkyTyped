package typingsSlinky.antDesignPro

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object authorizedMod {
  type IReactComponent[P] = slinky.core.ReactComponentClass[P]
  type Secured = js.Function2[
    /* authority */ typingsSlinky.antDesignPro.authorizedRouteMod.authority, 
    /* error */ js.UndefOr[slinky.core.TagMod[scala.Any]], 
    js.Function1[
      /* target */ typingsSlinky.antDesignPro.authorizedMod.IReactComponent[js.Any], 
      typingsSlinky.antDesignPro.authorizedMod.IReactComponent[js.Any]
    ]
  ]
  type check = js.Function3[
    /* authority */ typingsSlinky.antDesignPro.authorizedRouteMod.authority, 
    /* target */ typingsSlinky.antDesignPro.authorizedMod.IReactComponent[js.Any], 
    /* Exception */ typingsSlinky.antDesignPro.authorizedMod.IReactComponent[js.Any], 
    typingsSlinky.antDesignPro.authorizedMod.IReactComponent[js.Any]
  ]
}
