package typingsSlinky.inboxsdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  @scala.inline
  def load(version: scala.Double): js.Promise[typingsSlinky.inboxsdk.mod.InboxSDKInstance] = typingsSlinky.inboxsdk.mod.^.asInstanceOf[js.Dynamic].applyDynamic("load")(version.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsSlinky.inboxsdk.mod.InboxSDKInstance]]
  @scala.inline
  def load(
    version: scala.Double,
    appId: js.UndefOr[scala.Nothing],
    opts: typingsSlinky.inboxsdk.mod.LoadOptions
  ): js.Promise[typingsSlinky.inboxsdk.mod.InboxSDKInstance] = (typingsSlinky.inboxsdk.mod.^.asInstanceOf[js.Dynamic].applyDynamic("load")(version.asInstanceOf[js.Any], appId.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.inboxsdk.mod.InboxSDKInstance]]
  @scala.inline
  def load(version: scala.Double, appId: java.lang.String): js.Promise[typingsSlinky.inboxsdk.mod.InboxSDKInstance] = (typingsSlinky.inboxsdk.mod.^.asInstanceOf[js.Dynamic].applyDynamic("load")(version.asInstanceOf[js.Any], appId.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.inboxsdk.mod.InboxSDKInstance]]
  @scala.inline
  def load(version: scala.Double, appId: java.lang.String, opts: typingsSlinky.inboxsdk.mod.LoadOptions): js.Promise[typingsSlinky.inboxsdk.mod.InboxSDKInstance] = (typingsSlinky.inboxsdk.mod.^.asInstanceOf[js.Dynamic].applyDynamic("load")(version.asInstanceOf[js.Any], appId.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.inboxsdk.mod.InboxSDKInstance]]
  
  @scala.inline
  def loadScript(url: java.lang.String): js.Promise[scala.Unit] = typingsSlinky.inboxsdk.mod.^.asInstanceOf[js.Dynamic].applyDynamic("loadScript")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[scala.Unit]]
  @scala.inline
  def loadScript(url: java.lang.String, options: typingsSlinky.inboxsdk.mod.LoadScriptOptions): js.Promise[scala.Unit] = (typingsSlinky.inboxsdk.mod.^.asInstanceOf[js.Dynamic].applyDynamic("loadScript")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[scala.Unit]]
}
