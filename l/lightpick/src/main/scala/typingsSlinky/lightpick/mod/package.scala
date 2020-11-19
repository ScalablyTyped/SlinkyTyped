package typingsSlinky.lightpick

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type DisabledDate = typingsSlinky.lightpick.mod.InputDate | typingsSlinky.lightpick.mod.InputDateRange
  
  type FormatSpecification = typingsSlinky.moment.mod.MomentFormatSpecification
  
  type InputDate = typingsSlinky.moment.mod.MomentInput | scala.Null
  
  type InputDateRange = js.Tuple2[typingsSlinky.lightpick.mod.InputDate, typingsSlinky.lightpick.mod.InputDate]
  
  type Options = typingsSlinky.lightpick.mod.Options_
  
  type OutputDate = typingsSlinky.moment.mod.Moment | scala.Null
}
