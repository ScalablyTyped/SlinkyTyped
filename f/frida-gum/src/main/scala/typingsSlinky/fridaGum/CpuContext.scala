package typingsSlinky.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.fridaGum.PortableCpuContext
  - typingsSlinky.fridaGum.Ia32CpuContext
  - typingsSlinky.fridaGum.X64CpuContext
  - typingsSlinky.fridaGum.ArmCpuContext
  - typingsSlinky.fridaGum.Arm64CpuContext
  - typingsSlinky.fridaGum.MipsCpuContext
*/
trait CpuContext extends js.Object

object CpuContext {
  @scala.inline
  implicit def apply(value: Arm64CpuContext): CpuContext = value.asInstanceOf[CpuContext]
  @scala.inline
  implicit def apply(value: ArmCpuContext): CpuContext = value.asInstanceOf[CpuContext]
  @scala.inline
  implicit def apply(value: Ia32CpuContext): CpuContext = value.asInstanceOf[CpuContext]
  @scala.inline
  implicit def apply(value: MipsCpuContext): CpuContext = value.asInstanceOf[CpuContext]
  @scala.inline
  implicit def apply(value: PortableCpuContext): CpuContext = value.asInstanceOf[CpuContext]
  @scala.inline
  implicit def apply(value: X64CpuContext): CpuContext = value.asInstanceOf[CpuContext]
}

