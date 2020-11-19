package typingsSlinky.jenkins.anon

import typingsSlinky.jenkins.mod.JobBuildOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Build extends js.Object {
  
  def build(name: String, callback: js.Function2[/* err */ js.Error, /* data */ js.Any, Unit]): Unit = js.native
  def build(
    name: String,
    parameters: js.Any,
    callback: js.Function2[/* err */ js.Error, /* data */ js.Any, Unit]
  ): Unit = js.native
  def build(
    name: String,
    parameters: js.Any,
    token: String,
    callback: js.Function2[/* err */ js.Error, /* data */ js.Any, Unit]
  ): Unit = js.native
  def build(name: JobBuildOptions, callback: js.Function2[/* err */ js.Error, /* data */ js.Any, Unit]): Unit = js.native
  
  def config(name: String, callback: js.Function2[/* err */ js.Error, /* data */ js.Any, Unit]): Unit = js.native
  def config(name: String, xml: String, callback: js.Function2[/* err */ js.Error, /* data */ js.Any, Unit]): Unit = js.native
  
  def copy(name: String, from: String, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  
  def create(name: String, xml: String, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  
  def destroy(name: String, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  
  def disable(name: String, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  
  def enable(name: String, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  
  def exists(name: String, callback: js.Function2[/* err */ js.Error, /* exists */ Boolean, Unit]): Unit = js.native
  
  def get(name: String, callback: js.Function2[/* err */ js.Error, /* data */ js.Any, Unit]): Unit = js.native
  
  def list(callback: js.Function2[/* err */ js.Error, /* data */ js.Any, Unit]): Unit = js.native
}
