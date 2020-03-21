package typingsSlinky.reactDates.mod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.moment.mod.Moment
import typingsSlinky.moment.mod.MomentFormatSpecification
import typingsSlinky.moment.mod.MomentInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// utils/toMomentObject.js
@JSImport("react-dates", "toMomentObject")
@js.native
object toMomentObject
  extends TopLevel[
      js.Function2[
        /* dateString */ MomentInput, 
        /* customFormat */ MomentFormatSpecification, 
        Moment | Null
      ]
    ]

