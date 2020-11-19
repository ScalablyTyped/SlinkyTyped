package typingsSlinky.jenkins.anon

import typingsSlinky.jenkins.jenkinsStrings.html
import typingsSlinky.jenkins.jenkinsStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Log extends js.Object {
  
  def get(name: String, n: Double): js.Promise[_] = js.native
  
  def log(name: String, n: Double): js.Promise[_] = js.native
  def log(
    name: String,
    n: Double,
    start: js.UndefOr[scala.Nothing],
    `type`: js.UndefOr[scala.Nothing],
    meta: Boolean
  ): js.Promise[_] = js.native
  def log(name: String, n: Double, start: Double): js.Promise[_] = js.native
  def log(name: String, n: Double, start: Double, `type`: js.UndefOr[scala.Nothing], meta: Boolean): js.Promise[_] = js.native
  
  def logStream(name: String, n: Double): js.Promise[_] = js.native
  def logStream(name: String, n: Double, `type`: js.UndefOr[scala.Nothing], delay: Double): js.Promise[_] = js.native
  @JSName("logStream")
  def logStream_html(name: String, n: Double, `type`: html): js.Promise[_] = js.native
  @JSName("logStream")
  def logStream_html(name: String, n: Double, `type`: html, delay: Double): js.Promise[_] = js.native
  @JSName("logStream")
  def logStream_text(name: String, n: Double, `type`: text): js.Promise[_] = js.native
  @JSName("logStream")
  def logStream_text(name: String, n: Double, `type`: text, delay: Double): js.Promise[_] = js.native
  
  @JSName("log")
  def log_html(name: String, n: Double, start: js.UndefOr[scala.Nothing], `type`: html): js.Promise[_] = js.native
  @JSName("log")
  def log_html(name: String, n: Double, start: js.UndefOr[scala.Nothing], `type`: html, meta: Boolean): js.Promise[_] = js.native
  @JSName("log")
  def log_html(name: String, n: Double, start: Double, `type`: html): js.Promise[_] = js.native
  @JSName("log")
  def log_html(name: String, n: Double, start: Double, `type`: html, meta: Boolean): js.Promise[_] = js.native
  @JSName("log")
  def log_text(name: String, n: Double, start: js.UndefOr[scala.Nothing], `type`: text): js.Promise[_] = js.native
  @JSName("log")
  def log_text(name: String, n: Double, start: js.UndefOr[scala.Nothing], `type`: text, meta: Boolean): js.Promise[_] = js.native
  @JSName("log")
  def log_text(name: String, n: Double, start: Double, `type`: text): js.Promise[_] = js.native
  @JSName("log")
  def log_text(name: String, n: Double, start: Double, `type`: text, meta: Boolean): js.Promise[_] = js.native
  
  def stop(name: String, n: Double): js.Promise[Unit] = js.native
  
  def term(name: String, n: Double): js.Promise[Unit] = js.native
}
