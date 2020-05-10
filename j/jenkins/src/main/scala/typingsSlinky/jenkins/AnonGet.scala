package typingsSlinky.jenkins

import typingsSlinky.jenkins.jenkinsStrings.html
import typingsSlinky.jenkins.jenkinsStrings.text
import typingsSlinky.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonGet extends js.Object {
  def get(name: String, n: Double, callback: js.Function2[/* err */ js.Error, /* data */ js.Any, Unit]): Unit = js.native
  def log(name: String, callback: js.Function2[/* err */ js.Error, /* data */ js.Any, Unit]): Unit = js.native
  def log(name: String, n: Double, callback: js.Function2[/* err */ js.Error, /* data */ js.Any, Unit]): Unit = js.native
  def log(
    name: String,
    n: Double,
    start: Double,
    callback: js.Function2[/* err */ js.Error, /* data */ js.Any, Unit]
  ): Unit = js.native
  def logStream(name: String, n: Double): ReadableStream = js.native
  def logStream(name: String, n: Double, options: AnonDelay): ReadableStream = js.native
  @JSName("log")
  def log_html(
    name: String,
    n: Double,
    start: Double,
    `type`: html,
    callback: js.Function2[/* err */ js.Error, /* data */ js.Any, Unit]
  ): Unit = js.native
  @JSName("log")
  def log_html(
    name: String,
    n: Double,
    start: Double,
    `type`: html,
    meta: Boolean,
    callback: js.Function2[/* err */ js.Error, /* data */ js.Any, Unit]
  ): Unit = js.native
  @JSName("log")
  def log_text(
    name: String,
    n: Double,
    start: Double,
    `type`: text,
    callback: js.Function2[/* err */ js.Error, /* data */ js.Any, Unit]
  ): Unit = js.native
  @JSName("log")
  def log_text(
    name: String,
    n: Double,
    start: Double,
    `type`: text,
    meta: Boolean,
    callback: js.Function2[/* err */ js.Error, /* data */ js.Any, Unit]
  ): Unit = js.native
  def stop(name: String, n: Double, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def term(name: String, n: Double, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
}

