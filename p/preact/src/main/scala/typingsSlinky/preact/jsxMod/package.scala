package typingsSlinky.preact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jsxMod {
  type Defaultize[Props, Defaults] = (typingsSlinky.std.Partial[
    typingsSlinky.std.Pick[
      Props, 
      typingsSlinky.std.Extract[/* keyof Props */ java.lang.String, /* keyof Defaults */ java.lang.String]
    ]
  ]) with (// Include the remaining properties from Props
  typingsSlinky.std.Pick[
    Props, 
    typingsSlinky.std.Exclude[/* keyof Props */ java.lang.String, /* keyof Defaults */ java.lang.String]
  ])
}
