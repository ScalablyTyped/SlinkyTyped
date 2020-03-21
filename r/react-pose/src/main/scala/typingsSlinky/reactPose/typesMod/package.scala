package typingsSlinky.reactPose

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type ConfigFactory = js.Function1[
    /* props */ typingsSlinky.reactPose.typesMod.PoseElementProps, 
    typingsSlinky.popmotionPose.typesMod.DomPopmotionConfig
  ]
  type CurrentPose = java.lang.String | js.Array[java.lang.String]
  type RefFunc = js.Function1[/* el */ org.scalajs.dom.raw.Element, js.Any]
}
