package typingsSlinky.iobroker.anon

import typingsSlinky.node.processMod.global.NodeJS.ProcessVersions
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Env extends StObject {
  
  var env: Record[String, String] = js.native
  
  var title: String = js.native
  
  var versions: ProcessVersions = js.native
}
object Env {
  
  @scala.inline
  def apply(env: Record[String, String], title: String, versions: ProcessVersions): Env = {
    val __obj = js.Dynamic.literal(env = env.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], versions = versions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Env]
  }
  
  @scala.inline
  implicit class EnvMutableBuilder[Self <: Env] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnv(value: Record[String, String]): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersions(value: ProcessVersions): Self = StObject.set(x, "versions", value.asInstanceOf[js.Any])
  }
}
