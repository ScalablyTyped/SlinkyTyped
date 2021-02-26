package typingsSlinky.electron.Electron

import typingsSlinky.electron.electronStrings.Browser
import typingsSlinky.electron.electronStrings.GPU
import typingsSlinky.electron.electronStrings.Tab
import typingsSlinky.electron.electronStrings.Unknown
import typingsSlinky.electron.electronStrings.Utility
import typingsSlinky.electron.electronStrings.Zygote
import typingsSlinky.electron.electronStrings.`Pepper Plugin Broker`
import typingsSlinky.electron.electronStrings.`Pepper Plugin`
import typingsSlinky.electron.electronStrings.`Sandbox helper`
import typingsSlinky.electron.electronStrings.high
import typingsSlinky.electron.electronStrings.low
import typingsSlinky.electron.electronStrings.medium
import typingsSlinky.electron.electronStrings.unknown_
import typingsSlinky.electron.electronStrings.untrusted
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProcessMetric extends StObject {
  
  // Docs: https://electronjs.org/docs/api/structures/process-metric
  /**
    * CPU usage of the process.
    */
  var cpu: CPUUsage = js.native
  
  /**
    * Creation time for this process. The time is represented as number of
    * milliseconds since epoch. Since the `pid` can be reused after a process dies, it
    * is useful to use both the `pid` and the `creationTime` to uniquely identify a
    * process.
    */
  var creationTime: Double = js.native
  
  /**
    * One of the following values:
    *
    * @platform win32
    */
  var integrityLevel: js.UndefOr[untrusted | low | medium | high | unknown_] = js.native
  
  /**
    * Memory information for the process.
    */
  var memory: MemoryInfo = js.native
  
  /**
    * The name of the process. i.e. for plugins it might be Flash. Examples for
    * utility: `Audio Service`, `Content Decryption Module Service`, `Network
    * Service`, `Video Capture`, etc.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Process id of the process.
    */
  var pid: Double = js.native
  
  /**
    * Whether the process is sandboxed on OS level.
    *
    * @platform darwin,win32
    */
  var sandboxed: js.UndefOr[Boolean] = js.native
  
  /**
    * Process type. One of the following values:
    */
  var `type`: Browser | Tab | Utility | Zygote | (`Sandbox helper`) | GPU | (`Pepper Plugin`) | (`Pepper Plugin Broker`) | Unknown = js.native
}
object ProcessMetric {
  
  @scala.inline
  def apply(
    cpu: CPUUsage,
    creationTime: Double,
    memory: MemoryInfo,
    pid: Double,
    `type`: Browser | Tab | Utility | Zygote | (`Sandbox helper`) | GPU | (`Pepper Plugin`) | (`Pepper Plugin Broker`) | Unknown
  ): ProcessMetric = {
    val __obj = js.Dynamic.literal(cpu = cpu.asInstanceOf[js.Any], creationTime = creationTime.asInstanceOf[js.Any], memory = memory.asInstanceOf[js.Any], pid = pid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessMetric]
  }
  
  @scala.inline
  implicit class ProcessMetricMutableBuilder[Self <: ProcessMetric] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCpu(value: CPUUsage): Self = StObject.set(x, "cpu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTime(value: Double): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntegrityLevel(value: untrusted | low | medium | high | unknown_): Self = StObject.set(x, "integrityLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntegrityLevelUndefined: Self = StObject.set(x, "integrityLevel", js.undefined)
    
    @scala.inline
    def setMemory(value: MemoryInfo): Self = StObject.set(x, "memory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPid(value: Double): Self = StObject.set(x, "pid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSandboxed(value: Boolean): Self = StObject.set(x, "sandboxed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSandboxedUndefined: Self = StObject.set(x, "sandboxed", js.undefined)
    
    @scala.inline
    def setType(
      value: Browser | Tab | Utility | Zygote | (`Sandbox helper`) | GPU | (`Pepper Plugin`) | (`Pepper Plugin Broker`) | Unknown
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
