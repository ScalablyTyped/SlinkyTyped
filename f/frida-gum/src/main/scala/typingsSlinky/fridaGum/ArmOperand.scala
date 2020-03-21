package typingsSlinky.fridaGum

import typingsSlinky.fridaGum.fridaGumStrings.cimm
import typingsSlinky.fridaGum.fridaGumStrings.fp
import typingsSlinky.fridaGum.fridaGumStrings.imm
import typingsSlinky.fridaGum.fridaGumStrings.mem
import typingsSlinky.fridaGum.fridaGumStrings.pimm
import typingsSlinky.fridaGum.fridaGumStrings.reg
import typingsSlinky.fridaGum.fridaGumStrings.setend
import typingsSlinky.fridaGum.fridaGumStrings.sysreg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.fridaGum.ArmRegOperand
  - typingsSlinky.fridaGum.ArmImmOperand
  - typingsSlinky.fridaGum.ArmMemOperand
  - typingsSlinky.fridaGum.ArmFpOperand
  - typingsSlinky.fridaGum.ArmCimmOperand
  - typingsSlinky.fridaGum.ArmPimmOperand
  - typingsSlinky.fridaGum.ArmSetendOperand
  - typingsSlinky.fridaGum.ArmSysregOperand
*/
trait ArmOperand extends js.Object

object ArmOperand {
  @scala.inline
  def ArmPimmOperand(
    subtracted: Boolean,
    `type`: pimm,
    value: Double,
    shift: AnonType = null,
    vectorIndex: Int | Double = null
  ): ArmOperand = {
    val __obj = js.Dynamic.literal(subtracted = subtracted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (shift != null) __obj.updateDynamic("shift")(shift.asInstanceOf[js.Any])
    if (vectorIndex != null) __obj.updateDynamic("vectorIndex")(vectorIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArmOperand]
  }
  @scala.inline
  def ArmRegOperand(
    subtracted: Boolean,
    `type`: reg,
    value: ArmRegister,
    shift: AnonType = null,
    vectorIndex: Int | Double = null
  ): ArmOperand = {
    val __obj = js.Dynamic.literal(subtracted = subtracted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (shift != null) __obj.updateDynamic("shift")(shift.asInstanceOf[js.Any])
    if (vectorIndex != null) __obj.updateDynamic("vectorIndex")(vectorIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArmOperand]
  }
  @scala.inline
  def ArmSysregOperand(
    subtracted: Boolean,
    `type`: sysreg,
    value: ArmRegister,
    shift: AnonType = null,
    vectorIndex: Int | Double = null
  ): ArmOperand = {
    val __obj = js.Dynamic.literal(subtracted = subtracted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (shift != null) __obj.updateDynamic("shift")(shift.asInstanceOf[js.Any])
    if (vectorIndex != null) __obj.updateDynamic("vectorIndex")(vectorIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArmOperand]
  }
  @scala.inline
  def ArmMemOperand(
    subtracted: Boolean,
    `type`: mem,
    value: AnonDisp,
    shift: AnonType = null,
    vectorIndex: Int | Double = null
  ): ArmOperand = {
    val __obj = js.Dynamic.literal(subtracted = subtracted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (shift != null) __obj.updateDynamic("shift")(shift.asInstanceOf[js.Any])
    if (vectorIndex != null) __obj.updateDynamic("vectorIndex")(vectorIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArmOperand]
  }
  @scala.inline
  def ArmImmOperand(
    subtracted: Boolean,
    `type`: imm,
    value: Double,
    shift: AnonType = null,
    vectorIndex: Int | Double = null
  ): ArmOperand = {
    val __obj = js.Dynamic.literal(subtracted = subtracted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (shift != null) __obj.updateDynamic("shift")(shift.asInstanceOf[js.Any])
    if (vectorIndex != null) __obj.updateDynamic("vectorIndex")(vectorIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArmOperand]
  }
  @scala.inline
  def ArmFpOperand(
    subtracted: Boolean,
    `type`: fp,
    value: Double,
    shift: AnonType = null,
    vectorIndex: Int | Double = null
  ): ArmOperand = {
    val __obj = js.Dynamic.literal(subtracted = subtracted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (shift != null) __obj.updateDynamic("shift")(shift.asInstanceOf[js.Any])
    if (vectorIndex != null) __obj.updateDynamic("vectorIndex")(vectorIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArmOperand]
  }
  @scala.inline
  def ArmCimmOperand(
    subtracted: Boolean,
    `type`: cimm,
    value: Double,
    shift: AnonType = null,
    vectorIndex: Int | Double = null
  ): ArmOperand = {
    val __obj = js.Dynamic.literal(subtracted = subtracted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (shift != null) __obj.updateDynamic("shift")(shift.asInstanceOf[js.Any])
    if (vectorIndex != null) __obj.updateDynamic("vectorIndex")(vectorIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArmOperand]
  }
  @scala.inline
  def ArmSetendOperand(
    subtracted: Boolean,
    `type`: setend,
    value: Endian,
    shift: AnonType = null,
    vectorIndex: Int | Double = null
  ): ArmOperand = {
    val __obj = js.Dynamic.literal(subtracted = subtracted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (shift != null) __obj.updateDynamic("shift")(shift.asInstanceOf[js.Any])
    if (vectorIndex != null) __obj.updateDynamic("vectorIndex")(vectorIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArmOperand]
  }
}

