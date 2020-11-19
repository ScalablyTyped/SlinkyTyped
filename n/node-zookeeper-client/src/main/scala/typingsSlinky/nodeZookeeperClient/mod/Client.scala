package typingsSlinky.nodeZookeeperClient.mod

import typingsSlinky.node.Buffer
import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.nodeZookeeperClient.nodeZookeeperClientStrings.authenticationFailed
import typingsSlinky.nodeZookeeperClient.nodeZookeeperClientStrings.connected
import typingsSlinky.nodeZookeeperClient.nodeZookeeperClientStrings.connectedReadOnly
import typingsSlinky.nodeZookeeperClient.nodeZookeeperClientStrings.disconnected
import typingsSlinky.nodeZookeeperClient.nodeZookeeperClientStrings.expired
import typingsSlinky.nodeZookeeperClient.nodeZookeeperClientStrings.state
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Client extends EventEmitter {
  
  def addAuthInfo(scheme: String, auth: Buffer): Unit = js.native
  
  def addListener(event: String, cb: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_authenticationFailed(event: authenticationFailed, cb: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_connected(event: connected, cb: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_connectedReadOnly(event: connectedReadOnly, cb: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_disconnected(event: disconnected, cb: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_expired(event: expired, cb: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_state(event: state, cb: js.Function1[/* state */ State, Unit]): this.type = js.native
  
  def close(): Unit = js.native
  
  def connect(): Unit = js.native
  
  def create(path: String, callback: js.Function2[/* error */ js.Error | Exception, /* path */ String, Unit]): Unit = js.native
  def create(
    path: String,
    dataOrAclsOrmode1: js.Array[ACL],
    callback: js.Function2[/* error */ js.Error | Exception, /* path */ String, Unit]
  ): Unit = js.native
  def create(
    path: String,
    dataOrAclsOrmode1: js.Array[ACL],
    dataOrAclsOrmode2: js.Array[ACL],
    callback: js.Function2[/* error */ js.Error | Exception, /* path */ String, Unit]
  ): Unit = js.native
  def create(
    path: String,
    dataOrAclsOrmode1: js.Array[ACL],
    dataOrAclsOrmode2: js.Array[ACL],
    dataOrAclsOrmode3: js.Array[ACL],
    callback: js.Function2[/* error */ js.Error | Exception, /* path */ String, Unit]
  ): Unit = js.native
  def create(
    path: String,
    dataOrAclsOrmode1: js.Array[ACL],
    dataOrAclsOrmode2: js.Array[ACL],
    dataOrAclsOrmode3: Double,
    callback: js.Function2[/* error */ js.Error | Exception, /* path */ String, Unit]
  ): Unit = js.native
  def create(
    path: String,
    dataOrAclsOrmode1: js.Array[ACL],
    dataOrAclsOrmode2: js.Array[ACL],
    dataOrAclsOrmode3: Buffer,
    callback: js.Function2[/* error */ js.Error | Exception, /* path */ String, Unit]
  ): Unit = js.native
  def create(
    path: String,
    dataOrAclsOrmode1: js.Array[ACL],
    dataOrAclsOrmode2: Double,
    callback: js.Function2[/* error */ js.Error | Exception, /* path */ String, Unit]
  ): Unit = js.native
  def create(
    path: String,
    dataOrAclsOrmode1: js.Array[ACL],
    dataOrAclsOrmode2: Double,
    dataOrAclsOrmode3: js.Array[ACL],
    callback: js.Function2[/* error */ js.Error | Exception, /* path */ String, Unit]
  ): Unit = js.native
  def create(
    path: String,
    dataOrAclsOrmode1: js.Array[ACL],
    dataOrAclsOrmode2: Double,
    dataOrAclsOrmode3: Double,
    callback: js.Function2[/* error */ js.Error | Exception, /* path */ String, Unit]
  ): Unit = js.native
  def create(
    path: String,
    dataOrAclsOrmode1: js.Array[ACL],
    dataOrAclsOrmode2: Double,
    dataOrAclsOrmode3: Buffer,
    callback: js.Function2[/* error */ js.Error | Exception, /* path */ String, Unit]
  ): Unit = js.native
  def create(
    path: String,
    dataOrAclsOrmode1: js.Array[ACL],
    dataOrAclsOrmode2: Buffer,
    callback: js.Function2[/* error */ js.Error | Exception, /* path */ String, Unit]
  ): Unit = js.native
  def create(
    path: String,
    dataOrAclsOrmode1: js.Array[ACL],
    dataOrAclsOrmode2: Buffer,
    dataOrAclsOrmode3: js.Array[ACL],
    callback: js.Function2[/* error */ js.Error | Exception, /* path */ String, Unit]
  ): Unit = js.native
  def create(
    path: String,
    dataOrAclsOrmode1: js.Array[ACL],
    dataOrAclsOrmode2: Buffer,
    dataOrAclsOrmode3: Double,
    callback: js.Function2[/* error */ js.Error | Exception, /* path */ String, Unit]
  ): Unit = js.native
  def create(
    path: String,
    dataOrAclsOrmode1: js.Array[ACL],
    dataOrAclsOrmode2: Buffer,
    dataOrAclsOrmode3: Buffer,
    callback: js.Function2[/* error */ js.Error | Exception, /* path */ String, Unit]
  ): Unit = js.native
  def create(
    path: String,
    dataOrAclsOrmode1: Double,
    callback: js.Function2[/* error */ js.Error | Exception, /* path */ String, Unit]
  ): Unit = js.native
  def create(
    path: String,
    dataOrAclsOrmode1: Double,
    dataOrAclsOrmode2: js.Array[ACL],
    callback: js.Function2[/* error */ js.Error | Exception, /* path */ String, Unit]
  ): Unit = js.native
  def create(
    path: String,
    dataOrAclsOrmode1: Double,
    dataOrAclsOrmode2: js.Array[ACL],
    dataOrAclsOrmode3: js.Array[ACL],
    callback: js.Function2[/* error */ js.Error | Exception, /* path */ String, Unit]
  ): Unit = js.native
  def create(
    path: String,
    dataOrAclsOrmode1: Double,
    dataOrAclsOrmode2: js.Array[ACL],
    dataOrAclsOrmode3: Double,
    callback: js.Function2[/* error */ js.Error | Exception, /* path */ String, Unit]
  ): Unit = js.native
  def create(
    path: String,
    dataOrAclsOrmode1: Double,
    dataOrAclsOrmode2: js.Array[ACL],
    dataOrAclsOrmode3: Buffer,
    callback: js.Function2[/* error */ js.Error | Exception, /* path */ String, Unit]
  ): Unit = js.native
  def create(
    path: String,
    dataOrAclsOrmode1: Double,
    dataOrAclsOrmode2: Double,
    callback: js.Function2[/* error */ js.Error | Exception, /* path */ String, Unit]
  ): Unit = js.native
  def create(
    path: String,
    dataOrAclsOrmode1: Double,
    dataOrAclsOrmode2: Double,
    dataOrAclsOrmode3: js.Array[ACL],
    callback: js.Function2[/* error */ js.Error | Exception, /* path */ String, Unit]
  ): Unit = js.native
  def create(
    path: String,
    dataOrAclsOrmode1: Double,
    dataOrAclsOrmode2: Double,
    dataOrAclsOrmode3: Double,
    callback: js.Function2[/* error */ js.Error | Exception, /* path */ String, Unit]
  ): Unit = js.native
  def create(
    path: String,
    dataOrAclsOrmode1: Double,
    dataOrAclsOrmode2: Double,
    dataOrAclsOrmode3: Buffer,
    callback: js.Function2[/* error */ js.Error | Exception, /* path */ String, Unit]
  ): Unit = js.native
  def create(
    path: String,
    dataOrAclsOrmode1: Double,
    dataOrAclsOrmode2: Buffer,
    callback: js.Function2[/* error */ js.Error | Exception, /* path */ String, Unit]
  ): Unit = js.native
  def create(
    path: String,
    dataOrAclsOrmode1: Double,
    dataOrAclsOrmode2: Buffer,
    dataOrAclsOrmode3: js.Array[ACL],
    callback: js.Function2[/* error */ js.Error | Exception, /* path */ String, Unit]
  ): Unit = js.native
  def create(
    path: String,
    dataOrAclsOrmode1: Double,
    dataOrAclsOrmode2: Buffer,
    dataOrAclsOrmode3: Double,
    callback: js.Function2[/* error */ js.Error | Exception, /* path */ String, Unit]
  ): Unit = js.native
  def create(
    path: String,
    dataOrAclsOrmode1: Double,
    dataOrAclsOrmode2: Buffer,
    dataOrAclsOrmode3: Buffer,
    callback: js.Function2[/* error */ js.Error | Exception, /* path */ String, Unit]
  ): Unit = js.native
  def create(
    path: String,
    dataOrAclsOrmode1: Buffer,
    callback: js.Function2[/* error */ js.Error | Exception, /* path */ String, Unit]
  ): Unit = js.native
  def create(
    path: String,
    dataOrAclsOrmode1: Buffer,
    dataOrAclsOrmode2: js.Array[ACL],
    callback: js.Function2[/* error */ js.Error | Exception, /* path */ String, Unit]
  ): Unit = js.native
  def create(
    path: String,
    dataOrAclsOrmode1: Buffer,
    dataOrAclsOrmode2: js.Array[ACL],
    dataOrAclsOrmode3: js.Array[ACL],
    callback: js.Function2[/* error */ js.Error | Exception, /* path */ String, Unit]
  ): Unit = js.native
  def create(
    path: String,
    dataOrAclsOrmode1: Buffer,
    dataOrAclsOrmode2: js.Array[ACL],
    dataOrAclsOrmode3: Double,
    callback: js.Function2[/* error */ js.Error | Exception, /* path */ String, Unit]
  ): Unit = js.native
  def create(
    path: String,
    dataOrAclsOrmode1: Buffer,
    dataOrAclsOrmode2: js.Array[ACL],
    dataOrAclsOrmode3: Buffer,
    callback: js.Function2[/* error */ js.Error | Exception, /* path */ String, Unit]
  ): Unit = js.native
  def create(
    path: String,
    dataOrAclsOrmode1: Buffer,
    dataOrAclsOrmode2: Double,
    callback: js.Function2[/* error */ js.Error | Exception, /* path */ String, Unit]
  ): Unit = js.native
  def create(
    path: String,
    dataOrAclsOrmode1: Buffer,
    dataOrAclsOrmode2: Double,
    dataOrAclsOrmode3: js.Array[ACL],
    callback: js.Function2[/* error */ js.Error | Exception, /* path */ String, Unit]
  ): Unit = js.native
  def create(
    path: String,
    dataOrAclsOrmode1: Buffer,
    dataOrAclsOrmode2: Double,
    dataOrAclsOrmode3: Double,
    callback: js.Function2[/* error */ js.Error | Exception, /* path */ String, Unit]
  ): Unit = js.native
  def create(
    path: String,
    dataOrAclsOrmode1: Buffer,
    dataOrAclsOrmode2: Double,
    dataOrAclsOrmode3: Buffer,
    callback: js.Function2[/* error */ js.Error | Exception, /* path */ String, Unit]
  ): Unit = js.native
  def create(
    path: String,
    dataOrAclsOrmode1: Buffer,
    dataOrAclsOrmode2: Buffer,
    callback: js.Function2[/* error */ js.Error | Exception, /* path */ String, Unit]
  ): Unit = js.native
  def create(
    path: String,
    dataOrAclsOrmode1: Buffer,
    dataOrAclsOrmode2: Buffer,
    dataOrAclsOrmode3: js.Array[ACL],
    callback: js.Function2[/* error */ js.Error | Exception, /* path */ String, Unit]
  ): Unit = js.native
  def create(
    path: String,
    dataOrAclsOrmode1: Buffer,
    dataOrAclsOrmode2: Buffer,
    dataOrAclsOrmode3: Double,
    callback: js.Function2[/* error */ js.Error | Exception, /* path */ String, Unit]
  ): Unit = js.native
  def create(
    path: String,
    dataOrAclsOrmode1: Buffer,
    dataOrAclsOrmode2: Buffer,
    dataOrAclsOrmode3: Buffer,
    callback: js.Function2[/* error */ js.Error | Exception, /* path */ String, Unit]
  ): Unit = js.native
  
  def exists(path: String, callback: js.Function2[/* error */ js.Error | Exception, /* stat */ Stat, Unit]): Unit = js.native
  def exists(
    path: String,
    watcher: js.Function1[/* event */ Event, Unit],
    callback: js.Function2[/* error */ js.Error | Exception, /* stat */ Stat, Unit]
  ): Unit = js.native
  
  def getACL(
    path: String,
    callback: js.Function3[/* error */ js.Error | Exception, /* acls */ js.Array[ACL], /* stat */ Stat, Unit]
  ): Unit = js.native
  
  def getChildren(
    path: String,
    callback: js.Function3[
      /* error */ js.Error | Exception, 
      /* children */ js.Array[String], 
      /* stat */ Stat, 
      Unit
    ]
  ): Unit = js.native
  def getChildren(
    path: String,
    watcher: js.Function1[/* event */ Event, Unit],
    callback: js.Function3[
      /* error */ js.Error | Exception, 
      /* children */ js.Array[String], 
      /* stat */ Stat, 
      Unit
    ]
  ): Unit = js.native
  
  def getData(
    path: String,
    callback: js.Function3[/* error */ js.Error | Exception, /* data */ Buffer, /* stat */ Stat, Unit]
  ): Unit = js.native
  def getData(
    path: String,
    watcher: js.Function1[/* event */ Event, Unit],
    callback: js.Function3[/* error */ js.Error | Exception, /* data */ Buffer, /* stat */ Stat, Unit]
  ): Unit = js.native
  
  def getSessionId(): Buffer = js.native
  
  def getSessionPassword(): Buffer = js.native
  
  def getSessionTimeout(): Double = js.native
  
  def getState(): State = js.native
  
  def mkdirp(path: String, callback: js.Function2[/* error */ js.Error | Exception, /* path */ String, Unit]): Unit = js.native
  def mkdirp(
    path: String,
    dataOrAclsOrmode1: js.Array[ACL],
    callback: js.Function2[/* error */ js.Error | Exception, /* path */ String, Unit]
  ): Unit = js.native
  def mkdirp(
    path: String,
    dataOrAclsOrmode1: js.Array[ACL],
    dataOrAclsOrmode2: js.Array[ACL],
    callback: js.Function2[/* error */ js.Error | Exception, /* path */ String, Unit]
  ): Unit = js.native
  def mkdirp(
    path: String,
    dataOrAclsOrmode1: js.Array[ACL],
    dataOrAclsOrmode2: js.Array[ACL],
    dataOrAclsOrmode3: js.Array[ACL],
    callback: js.Function2[/* error */ js.Error | Exception, /* path */ String, Unit]
  ): Unit = js.native
  def mkdirp(
    path: String,
    dataOrAclsOrmode1: js.Array[ACL],
    dataOrAclsOrmode2: js.Array[ACL],
    dataOrAclsOrmode3: Double,
    callback: js.Function2[/* error */ js.Error | Exception, /* path */ String, Unit]
  ): Unit = js.native
  def mkdirp(
    path: String,
    dataOrAclsOrmode1: js.Array[ACL],
    dataOrAclsOrmode2: js.Array[ACL],
    dataOrAclsOrmode3: Buffer,
    callback: js.Function2[/* error */ js.Error | Exception, /* path */ String, Unit]
  ): Unit = js.native
  def mkdirp(
    path: String,
    dataOrAclsOrmode1: js.Array[ACL],
    dataOrAclsOrmode2: Double,
    callback: js.Function2[/* error */ js.Error | Exception, /* path */ String, Unit]
  ): Unit = js.native
  def mkdirp(
    path: String,
    dataOrAclsOrmode1: js.Array[ACL],
    dataOrAclsOrmode2: Double,
    dataOrAclsOrmode3: js.Array[ACL],
    callback: js.Function2[/* error */ js.Error | Exception, /* path */ String, Unit]
  ): Unit = js.native
  def mkdirp(
    path: String,
    dataOrAclsOrmode1: js.Array[ACL],
    dataOrAclsOrmode2: Double,
    dataOrAclsOrmode3: Double,
    callback: js.Function2[/* error */ js.Error | Exception, /* path */ String, Unit]
  ): Unit = js.native
  def mkdirp(
    path: String,
    dataOrAclsOrmode1: js.Array[ACL],
    dataOrAclsOrmode2: Double,
    dataOrAclsOrmode3: Buffer,
    callback: js.Function2[/* error */ js.Error | Exception, /* path */ String, Unit]
  ): Unit = js.native
  def mkdirp(
    path: String,
    dataOrAclsOrmode1: js.Array[ACL],
    dataOrAclsOrmode2: Buffer,
    callback: js.Function2[/* error */ js.Error | Exception, /* path */ String, Unit]
  ): Unit = js.native
  def mkdirp(
    path: String,
    dataOrAclsOrmode1: js.Array[ACL],
    dataOrAclsOrmode2: Buffer,
    dataOrAclsOrmode3: js.Array[ACL],
    callback: js.Function2[/* error */ js.Error | Exception, /* path */ String, Unit]
  ): Unit = js.native
  def mkdirp(
    path: String,
    dataOrAclsOrmode1: js.Array[ACL],
    dataOrAclsOrmode2: Buffer,
    dataOrAclsOrmode3: Double,
    callback: js.Function2[/* error */ js.Error | Exception, /* path */ String, Unit]
  ): Unit = js.native
  def mkdirp(
    path: String,
    dataOrAclsOrmode1: js.Array[ACL],
    dataOrAclsOrmode2: Buffer,
    dataOrAclsOrmode3: Buffer,
    callback: js.Function2[/* error */ js.Error | Exception, /* path */ String, Unit]
  ): Unit = js.native
  def mkdirp(
    path: String,
    dataOrAclsOrmode1: Double,
    callback: js.Function2[/* error */ js.Error | Exception, /* path */ String, Unit]
  ): Unit = js.native
  def mkdirp(
    path: String,
    dataOrAclsOrmode1: Double,
    dataOrAclsOrmode2: js.Array[ACL],
    callback: js.Function2[/* error */ js.Error | Exception, /* path */ String, Unit]
  ): Unit = js.native
  def mkdirp(
    path: String,
    dataOrAclsOrmode1: Double,
    dataOrAclsOrmode2: js.Array[ACL],
    dataOrAclsOrmode3: js.Array[ACL],
    callback: js.Function2[/* error */ js.Error | Exception, /* path */ String, Unit]
  ): Unit = js.native
  def mkdirp(
    path: String,
    dataOrAclsOrmode1: Double,
    dataOrAclsOrmode2: js.Array[ACL],
    dataOrAclsOrmode3: Double,
    callback: js.Function2[/* error */ js.Error | Exception, /* path */ String, Unit]
  ): Unit = js.native
  def mkdirp(
    path: String,
    dataOrAclsOrmode1: Double,
    dataOrAclsOrmode2: js.Array[ACL],
    dataOrAclsOrmode3: Buffer,
    callback: js.Function2[/* error */ js.Error | Exception, /* path */ String, Unit]
  ): Unit = js.native
  def mkdirp(
    path: String,
    dataOrAclsOrmode1: Double,
    dataOrAclsOrmode2: Double,
    callback: js.Function2[/* error */ js.Error | Exception, /* path */ String, Unit]
  ): Unit = js.native
  def mkdirp(
    path: String,
    dataOrAclsOrmode1: Double,
    dataOrAclsOrmode2: Double,
    dataOrAclsOrmode3: js.Array[ACL],
    callback: js.Function2[/* error */ js.Error | Exception, /* path */ String, Unit]
  ): Unit = js.native
  def mkdirp(
    path: String,
    dataOrAclsOrmode1: Double,
    dataOrAclsOrmode2: Double,
    dataOrAclsOrmode3: Double,
    callback: js.Function2[/* error */ js.Error | Exception, /* path */ String, Unit]
  ): Unit = js.native
  def mkdirp(
    path: String,
    dataOrAclsOrmode1: Double,
    dataOrAclsOrmode2: Double,
    dataOrAclsOrmode3: Buffer,
    callback: js.Function2[/* error */ js.Error | Exception, /* path */ String, Unit]
  ): Unit = js.native
  def mkdirp(
    path: String,
    dataOrAclsOrmode1: Double,
    dataOrAclsOrmode2: Buffer,
    callback: js.Function2[/* error */ js.Error | Exception, /* path */ String, Unit]
  ): Unit = js.native
  def mkdirp(
    path: String,
    dataOrAclsOrmode1: Double,
    dataOrAclsOrmode2: Buffer,
    dataOrAclsOrmode3: js.Array[ACL],
    callback: js.Function2[/* error */ js.Error | Exception, /* path */ String, Unit]
  ): Unit = js.native
  def mkdirp(
    path: String,
    dataOrAclsOrmode1: Double,
    dataOrAclsOrmode2: Buffer,
    dataOrAclsOrmode3: Double,
    callback: js.Function2[/* error */ js.Error | Exception, /* path */ String, Unit]
  ): Unit = js.native
  def mkdirp(
    path: String,
    dataOrAclsOrmode1: Double,
    dataOrAclsOrmode2: Buffer,
    dataOrAclsOrmode3: Buffer,
    callback: js.Function2[/* error */ js.Error | Exception, /* path */ String, Unit]
  ): Unit = js.native
  def mkdirp(
    path: String,
    dataOrAclsOrmode1: Buffer,
    callback: js.Function2[/* error */ js.Error | Exception, /* path */ String, Unit]
  ): Unit = js.native
  def mkdirp(
    path: String,
    dataOrAclsOrmode1: Buffer,
    dataOrAclsOrmode2: js.Array[ACL],
    callback: js.Function2[/* error */ js.Error | Exception, /* path */ String, Unit]
  ): Unit = js.native
  def mkdirp(
    path: String,
    dataOrAclsOrmode1: Buffer,
    dataOrAclsOrmode2: js.Array[ACL],
    dataOrAclsOrmode3: js.Array[ACL],
    callback: js.Function2[/* error */ js.Error | Exception, /* path */ String, Unit]
  ): Unit = js.native
  def mkdirp(
    path: String,
    dataOrAclsOrmode1: Buffer,
    dataOrAclsOrmode2: js.Array[ACL],
    dataOrAclsOrmode3: Double,
    callback: js.Function2[/* error */ js.Error | Exception, /* path */ String, Unit]
  ): Unit = js.native
  def mkdirp(
    path: String,
    dataOrAclsOrmode1: Buffer,
    dataOrAclsOrmode2: js.Array[ACL],
    dataOrAclsOrmode3: Buffer,
    callback: js.Function2[/* error */ js.Error | Exception, /* path */ String, Unit]
  ): Unit = js.native
  def mkdirp(
    path: String,
    dataOrAclsOrmode1: Buffer,
    dataOrAclsOrmode2: Double,
    callback: js.Function2[/* error */ js.Error | Exception, /* path */ String, Unit]
  ): Unit = js.native
  def mkdirp(
    path: String,
    dataOrAclsOrmode1: Buffer,
    dataOrAclsOrmode2: Double,
    dataOrAclsOrmode3: js.Array[ACL],
    callback: js.Function2[/* error */ js.Error | Exception, /* path */ String, Unit]
  ): Unit = js.native
  def mkdirp(
    path: String,
    dataOrAclsOrmode1: Buffer,
    dataOrAclsOrmode2: Double,
    dataOrAclsOrmode3: Double,
    callback: js.Function2[/* error */ js.Error | Exception, /* path */ String, Unit]
  ): Unit = js.native
  def mkdirp(
    path: String,
    dataOrAclsOrmode1: Buffer,
    dataOrAclsOrmode2: Double,
    dataOrAclsOrmode3: Buffer,
    callback: js.Function2[/* error */ js.Error | Exception, /* path */ String, Unit]
  ): Unit = js.native
  def mkdirp(
    path: String,
    dataOrAclsOrmode1: Buffer,
    dataOrAclsOrmode2: Buffer,
    callback: js.Function2[/* error */ js.Error | Exception, /* path */ String, Unit]
  ): Unit = js.native
  def mkdirp(
    path: String,
    dataOrAclsOrmode1: Buffer,
    dataOrAclsOrmode2: Buffer,
    dataOrAclsOrmode3: js.Array[ACL],
    callback: js.Function2[/* error */ js.Error | Exception, /* path */ String, Unit]
  ): Unit = js.native
  def mkdirp(
    path: String,
    dataOrAclsOrmode1: Buffer,
    dataOrAclsOrmode2: Buffer,
    dataOrAclsOrmode3: Double,
    callback: js.Function2[/* error */ js.Error | Exception, /* path */ String, Unit]
  ): Unit = js.native
  def mkdirp(
    path: String,
    dataOrAclsOrmode1: Buffer,
    dataOrAclsOrmode2: Buffer,
    dataOrAclsOrmode3: Buffer,
    callback: js.Function2[/* error */ js.Error | Exception, /* path */ String, Unit]
  ): Unit = js.native
  
  def on(event: String, cb: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_authenticationFailed(event: authenticationFailed, cb: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_connected(event: connected, cb: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_connectedReadOnly(event: connectedReadOnly, cb: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_disconnected(event: disconnected, cb: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_expired(event: expired, cb: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_state(event: state, cb: js.Function1[/* state */ State, Unit]): this.type = js.native
  
  def once(event: String, cb: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_authenticationFailed(event: authenticationFailed, cb: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_connected(event: connected, cb: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_connectedReadOnly(event: connectedReadOnly, cb: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_disconnected(event: disconnected, cb: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_expired(event: expired, cb: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_state(event: state, cb: js.Function1[/* state */ State, Unit]): this.type = js.native
  
  def remove(path: String, callback: js.Function1[/* error */ js.Error | Exception, Unit]): Unit = js.native
  def remove(path: String, version: Double, callback: js.Function1[/* error */ js.Error | Exception, Unit]): Unit = js.native
  
  def setACL(
    path: String,
    acls: js.Array[ACL],
    callback: js.Function2[/* error */ js.Error | Exception, /* stat */ Stat, Unit]
  ): Unit = js.native
  def setACL(
    path: String,
    acls: js.Array[ACL],
    version: Double,
    callback: js.Function2[/* error */ js.Error | Exception, /* stat */ Stat, Unit]
  ): Unit = js.native
  
  def setData(
    path: String,
    data: Null,
    callback: js.Function2[/* error */ js.Error | Exception, /* stat */ Stat, Unit]
  ): Unit = js.native
  def setData(
    path: String,
    data: Null,
    version: Double,
    callback: js.Function2[/* error */ js.Error | Exception, /* stat */ Stat, Unit]
  ): Unit = js.native
  def setData(
    path: String,
    data: Buffer,
    callback: js.Function2[/* error */ js.Error | Exception, /* stat */ Stat, Unit]
  ): Unit = js.native
  def setData(
    path: String,
    data: Buffer,
    version: Double,
    callback: js.Function2[/* error */ js.Error | Exception, /* stat */ Stat, Unit]
  ): Unit = js.native
  
  def transaction(): Transaction = js.native
}
