package typingsSlinky.ndnJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object faceMod {
  type OnInterestCallback = js.Function5[
    /* prefix */ typingsSlinky.ndnJs.nameMod.Name, 
    /* interest */ typingsSlinky.ndnJs.interestMod.Interest, 
    /* face */ typingsSlinky.ndnJs.faceMod.Face, 
    /* filterId */ scala.Double, 
    /* filter */ typingsSlinky.ndnJs.faceMod.InterestFilter, 
    js.Any
  ]
}
