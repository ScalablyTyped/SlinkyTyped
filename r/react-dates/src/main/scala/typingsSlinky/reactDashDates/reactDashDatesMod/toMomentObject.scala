package typingsSlinky.reactDashDates.reactDashDatesMod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.moment.momentMod.Moment
import typingsSlinky.moment.momentMod.MomentFormatSpecification
import typingsSlinky.moment.momentMod.MomentInput
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

