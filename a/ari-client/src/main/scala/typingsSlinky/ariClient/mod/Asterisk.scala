package typingsSlinky.ariClient.mod

import typingsSlinky.ariClient.AnonConfigClass
import typingsSlinky.ariClient.AnonConfiguration
import typingsSlinky.ariClient.AnonFields
import typingsSlinky.ariClient.AnonLogChannelName
import typingsSlinky.ariClient.AnonModuleName
import typingsSlinky.ariClient.AnonOnly
import typingsSlinky.ariClient.AnonValue
import typingsSlinky.ariClient.AnonVariable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Asterisk extends js.Object {
  def addLog(params: AnonConfiguration): js.Promise[Unit] = js.native
  def addLog(params: AnonConfiguration, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def deleteLog(params: AnonLogChannelName): js.Promise[Unit] = js.native
  def deleteLog(params: AnonLogChannelName, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def deleteObject(params: AnonConfigClass): js.Promise[Unit] = js.native
  def deleteObject(params: AnonConfigClass, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def getGlobalVar(params: AnonVariable): js.Promise[Variable] = js.native
  def getGlobalVar(params: AnonVariable, callback: js.Function2[/* err */ js.Error, /* variable */ Variable, Unit]): Unit = js.native
  def getInfo(): js.Promise[AsteriskInfo] = js.native
  def getInfo(callback: js.Function2[/* err */ js.Error, /* asteriskinfo */ AsteriskInfo, Unit]): Unit = js.native
  def getInfo(params: AnonOnly): js.Promise[AsteriskInfo] = js.native
  def getInfo(
    params: AnonOnly,
    callback: js.Function2[/* err */ js.Error, /* asteriskinfo */ AsteriskInfo, Unit]
  ): Unit = js.native
  def getModule(params: AnonModuleName): js.Promise[Module] = js.native
  def getModule(params: AnonModuleName, callback: js.Function2[/* err */ js.Error, /* module */ Module, Unit]): Unit = js.native
  def getObject(params: AnonConfigClass): js.Promise[js.Array[ConfigTuple]] = js.native
  /* Methods */
  def getObject(
    params: AnonConfigClass,
    callback: js.Function2[/* err */ js.Error, /* configtuples */ js.Array[ConfigTuple], Unit]
  ): Unit = js.native
  def listLogChannels(): js.Promise[js.Array[LogChannel]] = js.native
  def listLogChannels(callback: js.Function2[/* err */ js.Error, /* logchannels */ js.Array[LogChannel], Unit]): Unit = js.native
  def listModules(): js.Promise[js.Array[Module]] = js.native
  def listModules(callback: js.Function2[/* err */ js.Error, /* modules */ js.Array[Module], Unit]): Unit = js.native
  def loadModule(params: AnonModuleName): js.Promise[Unit] = js.native
  def loadModule(params: AnonModuleName, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def ping(): js.Promise[AsteriskPing] = js.native
  def ping(callback: js.Function2[/* err */ js.Error, /* asteriskping */ AsteriskPing, Unit]): Unit = js.native
  def reloadModule(params: AnonModuleName): js.Promise[Unit] = js.native
  def reloadModule(params: AnonModuleName, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def rotateLog(params: AnonLogChannelName): js.Promise[Unit] = js.native
  def rotateLog(params: AnonLogChannelName, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def setGlobalVar(params: AnonValue): js.Promise[Unit] = js.native
  def setGlobalVar(params: AnonValue, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def unloadModule(params: AnonModuleName): js.Promise[Unit] = js.native
  def unloadModule(params: AnonModuleName, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def updateObject(params: AnonFields): js.Promise[js.Array[ConfigTuple]] = js.native
  def updateObject(
    params: AnonFields,
    callback: js.Function2[/* err */ js.Error, /* configtuples */ js.Array[ConfigTuple], Unit]
  ): Unit = js.native
}

