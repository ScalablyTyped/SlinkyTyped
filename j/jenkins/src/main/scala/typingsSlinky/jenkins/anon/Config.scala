package typingsSlinky.jenkins.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Config extends js.Object {
  
  def config(name: String, callback: js.Function2[/* err */ js.Error, /* data */ js.Any, Unit]): Unit = js.native
  
  def create(name: String, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  
  def destroy(name: String, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  
  def disable(name: String, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def disable(name: String, message: String, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  
  def disconnect(name: String, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def disconnect(name: String, message: String, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  
  def enable(name: String, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  
  def exists(name: String, callback: js.Function2[/* err */ js.Error, /* data */ Boolean, Unit]): Unit = js.native
  
  def get(name: String, callback: js.Function2[/* err */ js.Error, /* data */ js.Any, Unit]): Unit = js.native
  
  def list(callback: js.Function2[/* err */ js.Error, /* data */ js.Any, Unit]): Unit = js.native
  def list(full: Boolean, callback: js.Function2[/* err */ js.Error, /* data */ js.Any, Unit]): Unit = js.native
}
