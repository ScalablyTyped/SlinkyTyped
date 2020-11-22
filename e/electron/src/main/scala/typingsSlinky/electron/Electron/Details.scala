package typingsSlinky.electron.Electron

import typingsSlinky.electron.electronStrings.GPU
import typingsSlinky.electron.electronStrings.Unknown
import typingsSlinky.electron.electronStrings.Utility
import typingsSlinky.electron.electronStrings.Zygote
import typingsSlinky.electron.electronStrings.`Pepper Plugin Broker`
import typingsSlinky.electron.electronStrings.`Pepper Plugin`
import typingsSlinky.electron.electronStrings.`Sandbox helper`
import typingsSlinky.electron.electronStrings.`abnormal-exit`
import typingsSlinky.electron.electronStrings.`clean-exit`
import typingsSlinky.electron.electronStrings.`integrity-failure`
import typingsSlinky.electron.electronStrings.`launch-failed`
import typingsSlinky.electron.electronStrings.crashed
import typingsSlinky.electron.electronStrings.killed
import typingsSlinky.electron.electronStrings.oom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Details extends js.Object {
  
  /**
    * The exit code for the process (e.g. status from waitpid if on posix, from
    * GetExitCodeProcess on Windows).
    */
  var exitCode: Double = js.native
  
  /**
    * The name of the process. i.e. for plugins it might be Flash. Examples for
    * utility: `Audio Service`, `Content Decryption Module Service`, `Network
    * Service`, `Video Capture`, etc.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The reason the child process is gone. Possible values:
    */
  var reason: `clean-exit` | `abnormal-exit` | killed | crashed | oom | `launch-failed` | `integrity-failure` = js.native
  
  /**
    * Process type. One of the following values:
    */
  var `type`: Utility | Zygote | (`Sandbox helper`) | GPU | (`Pepper Plugin`) | (`Pepper Plugin Broker`) | Unknown = js.native
}
object Details {
  
  @scala.inline
  def apply(
    exitCode: Double,
    reason: `clean-exit` | `abnormal-exit` | killed | crashed | oom | `launch-failed` | `integrity-failure`,
    `type`: Utility | Zygote | (`Sandbox helper`) | GPU | (`Pepper Plugin`) | (`Pepper Plugin Broker`) | Unknown
  ): Details = {
    val __obj = js.Dynamic.literal(exitCode = exitCode.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Details]
  }
  
  @scala.inline
  implicit class DetailsOps[Self <: Details] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setExitCode(value: Double): Self = this.set("exitCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReason(
      value: `clean-exit` | `abnormal-exit` | killed | crashed | oom | `launch-failed` | `integrity-failure`
    ): Self = this.set("reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(
      value: Utility | Zygote | (`Sandbox helper`) | GPU | (`Pepper Plugin`) | (`Pepper Plugin Broker`) | Unknown
    ): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
