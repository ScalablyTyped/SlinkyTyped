package typingsSlinky.beanstalkd.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BeanstalkdProtocol extends js.Object {
  def add(signature: String, key: String): Unit = js.native
  def addCommand(signature: String): Unit = js.native
  def addReply(signature: String): Unit = js.native
  def addType(key: String, `type`: js.Any): Unit = js.native
  def build(identifier: String, args: js.Array[_], key: String): Buffer = js.native
  def buildCommand(command: String, args: js.Array[_]): Buffer = js.native
  def buildPut(args: js.Array[_]): Buffer = js.native
  def buildreply(reply: String, args: js.Array[_]): Buffer = js.native
  def parse(buffer: Buffer, key: String): js.Tuple2[Buffer | Null, BeanstalkdProtocolCommand | BeanstalkdProtocolReply | Null] = js.native
  def parseCommand(buffer: Buffer): js.Tuple2[Buffer | Null, BeanstalkdProtocolCommand | Null] = js.native
  def parseReply(buffer: Buffer): js.Tuple2[Buffer | Null, BeanstalkdProtocolReply | Null] = js.native
  def reset(): Unit = js.native
}

object BeanstalkdProtocol {
  @scala.inline
  def apply(
    add: (String, String) => Unit,
    addCommand: String => Unit,
    addReply: String => Unit,
    addType: (String, js.Any) => Unit,
    build: (String, js.Array[_], String) => Buffer,
    buildCommand: (String, js.Array[_]) => Buffer,
    buildPut: js.Array[_] => Buffer,
    buildreply: (String, js.Array[_]) => Buffer,
    parse: (Buffer, String) => js.Tuple2[Buffer | Null, BeanstalkdProtocolCommand | BeanstalkdProtocolReply | Null],
    parseCommand: Buffer => js.Tuple2[Buffer | Null, BeanstalkdProtocolCommand | Null],
    parseReply: Buffer => js.Tuple2[Buffer | Null, BeanstalkdProtocolReply | Null],
    reset: () => Unit
  ): BeanstalkdProtocol = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), addCommand = js.Any.fromFunction1(addCommand), addReply = js.Any.fromFunction1(addReply), addType = js.Any.fromFunction2(addType), build = js.Any.fromFunction3(build), buildCommand = js.Any.fromFunction2(buildCommand), buildPut = js.Any.fromFunction1(buildPut), buildreply = js.Any.fromFunction2(buildreply), parse = js.Any.fromFunction2(parse), parseCommand = js.Any.fromFunction1(parseCommand), parseReply = js.Any.fromFunction1(parseReply), reset = js.Any.fromFunction0(reset))
    __obj.asInstanceOf[BeanstalkdProtocol]
  }
  @scala.inline
  implicit class BeanstalkdProtocolOps[Self <: BeanstalkdProtocol] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdd(value: (String, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withAddCommand(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addCommand")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAddReply(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addReply")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAddType(value: (String, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addType")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withBuild(value: (String, js.Array[_], String) => Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("build")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withBuildCommand(value: (String, js.Array[_]) => Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildCommand")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withBuildPut(value: js.Array[_] => Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildPut")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBuildreply(value: (String, js.Array[_]) => Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildreply")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withParse(
      value: (Buffer, String) => js.Tuple2[Buffer | Null, BeanstalkdProtocolCommand | BeanstalkdProtocolReply | Null]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parse")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withParseCommand(value: Buffer => js.Tuple2[Buffer | Null, BeanstalkdProtocolCommand | Null]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseCommand")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withParseReply(value: Buffer => js.Tuple2[Buffer | Null, BeanstalkdProtocolReply | Null]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseReply")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withReset(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reset")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

