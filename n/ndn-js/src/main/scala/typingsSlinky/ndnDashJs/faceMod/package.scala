package typingsSlinky.ndnDashJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object faceMod {
  import typingsSlinky.ndnDashJs.interestMod.Interest
  import typingsSlinky.ndnDashJs.nameMod.Name

  type OnInterestCallback = js.Function5[
    /* prefix */ Name, 
    /* interest */ Interest, 
    /* face */ Face, 
    /* filterId */ Double, 
    /* filter */ InterestFilter, 
    js.Any
  ]
}
