package typingsSlinky.grammarkdown.grammarkdownMod

import typingsSlinky.esfxCancelable.distMod.Cancelable
import typingsSlinky.prex.mod.CancellationToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown/dist/grammarkdown", "SyncHost")
@js.native
class SyncHost () extends HostBase {
  def this(hasReadFileSyncWriteFileSyncBaseOptions: SyncHostOptions) = this()
  
  def getSourceFileSync(file: String): js.UndefOr[SourceFile] = js.native
  def getSourceFileSync(file: String, cancelable: Cancelable): js.UndefOr[SourceFile] = js.native
  def getSourceFileSync(file: String, cancelable: CancellationToken): js.UndefOr[SourceFile] = js.native
  
  def readFileSync(file: String): js.UndefOr[String] = js.native
  def readFileSync(file: String, cancelable: Cancelable): js.UndefOr[String] = js.native
  def readFileSync(file: String, cancelable: CancellationToken): js.UndefOr[String] = js.native
  
  var readFileSyncCallback: js.Any = js.native
  
  def writeFileSync(file: String, text: String): Unit = js.native
  def writeFileSync(file: String, text: String, cancelable: Cancelable): Unit = js.native
  def writeFileSync(file: String, text: String, cancelable: CancellationToken): Unit = js.native
  
  var writeFileSyncCallback: js.Any = js.native
}
/* static members */
object SyncHost {
  
  @JSImport("grammarkdown/dist/grammarkdown", "SyncHost.forFile")
  @js.native
  def forFile(content: String): SyncSingleFileHost = js.native
  @JSImport("grammarkdown/dist/grammarkdown", "SyncHost.forFile")
  @js.native
  def forFile(content: String, file: js.UndefOr[scala.Nothing], hostFallback: SyncHost): SyncSingleFileHost = js.native
  @JSImport("grammarkdown/dist/grammarkdown", "SyncHost.forFile")
  @js.native
  def forFile(content: String, file: String): SyncSingleFileHost = js.native
  @JSImport("grammarkdown/dist/grammarkdown", "SyncHost.forFile")
  @js.native
  def forFile(content: String, file: String, hostFallback: SyncHost): SyncSingleFileHost = js.native
}
