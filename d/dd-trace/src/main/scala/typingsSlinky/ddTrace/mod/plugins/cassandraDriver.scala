package typingsSlinky.ddTrace.mod.plugins

import typingsSlinky.ddTrace.mod.Analyzable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This plugin automatically instruments the
  * [cassandra-driver](https://github.com/datastax/nodejs-driver) module.
  */
@js.native
trait cassandraDriver
  extends Integration
     with Analyzable
object cassandraDriver {
  
  @scala.inline
  def apply(): cassandraDriver = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[cassandraDriver]
  }
}
