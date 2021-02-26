package typingsSlinky.apolloProtobufjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object lightMod {
  
  @scala.inline
  def build: java.lang.String = typingsSlinky.apolloProtobufjs.lightMod.^.asInstanceOf[js.Dynamic].selectDynamic("build").asInstanceOf[java.lang.String]
  
  @scala.inline
  def configure(): scala.Unit = typingsSlinky.apolloProtobufjs.lightMod.^.asInstanceOf[js.Dynamic].applyDynamic("configure")().asInstanceOf[scala.Unit]
  
  @scala.inline
  def decoder(mtype: typingsSlinky.apolloProtobufjs.mod.Type): typingsSlinky.apolloProtobufjs.mod.Codegen = typingsSlinky.apolloProtobufjs.lightMod.^.asInstanceOf[js.Dynamic].applyDynamic("decoder")(mtype.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.apolloProtobufjs.mod.Codegen]
  
  @scala.inline
  def encoder(mtype: typingsSlinky.apolloProtobufjs.mod.Type): typingsSlinky.apolloProtobufjs.mod.Codegen = typingsSlinky.apolloProtobufjs.lightMod.^.asInstanceOf[js.Dynamic].applyDynamic("encoder")(mtype.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.apolloProtobufjs.mod.Codegen]
  
  @scala.inline
  def load(filename: java.lang.String): js.Promise[typingsSlinky.apolloProtobufjs.mod.Root] = typingsSlinky.apolloProtobufjs.lightMod.^.asInstanceOf[js.Dynamic].applyDynamic("load")(filename.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsSlinky.apolloProtobufjs.mod.Root]]
  @scala.inline
  def load(filename: java.lang.String, callback: typingsSlinky.apolloProtobufjs.mod.LoadCallback): scala.Unit = (typingsSlinky.apolloProtobufjs.lightMod.^.asInstanceOf[js.Dynamic].applyDynamic("load")(filename.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def load(filename: java.lang.String, root: typingsSlinky.apolloProtobufjs.mod.Root): js.Promise[typingsSlinky.apolloProtobufjs.mod.Root] = (typingsSlinky.apolloProtobufjs.lightMod.^.asInstanceOf[js.Dynamic].applyDynamic("load")(filename.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.apolloProtobufjs.mod.Root]]
  @scala.inline
  def load(
    filename: java.lang.String,
    root: typingsSlinky.apolloProtobufjs.mod.Root,
    callback: typingsSlinky.apolloProtobufjs.mod.LoadCallback
  ): scala.Unit = (typingsSlinky.apolloProtobufjs.lightMod.^.asInstanceOf[js.Dynamic].applyDynamic("load")(filename.asInstanceOf[js.Any], root.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def load(filename: js.Array[java.lang.String]): js.Promise[typingsSlinky.apolloProtobufjs.mod.Root] = typingsSlinky.apolloProtobufjs.lightMod.^.asInstanceOf[js.Dynamic].applyDynamic("load")(filename.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsSlinky.apolloProtobufjs.mod.Root]]
  @scala.inline
  def load(filename: js.Array[java.lang.String], callback: typingsSlinky.apolloProtobufjs.mod.LoadCallback): scala.Unit = (typingsSlinky.apolloProtobufjs.lightMod.^.asInstanceOf[js.Dynamic].applyDynamic("load")(filename.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def load(filename: js.Array[java.lang.String], root: typingsSlinky.apolloProtobufjs.mod.Root): js.Promise[typingsSlinky.apolloProtobufjs.mod.Root] = (typingsSlinky.apolloProtobufjs.lightMod.^.asInstanceOf[js.Dynamic].applyDynamic("load")(filename.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsSlinky.apolloProtobufjs.mod.Root]]
  @scala.inline
  def load(
    filename: js.Array[java.lang.String],
    root: typingsSlinky.apolloProtobufjs.mod.Root,
    callback: typingsSlinky.apolloProtobufjs.mod.LoadCallback
  ): scala.Unit = (typingsSlinky.apolloProtobufjs.lightMod.^.asInstanceOf[js.Dynamic].applyDynamic("load")(filename.asInstanceOf[js.Any], root.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def loadSync(filename: java.lang.String): typingsSlinky.apolloProtobufjs.mod.Root = typingsSlinky.apolloProtobufjs.lightMod.^.asInstanceOf[js.Dynamic].applyDynamic("loadSync")(filename.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.apolloProtobufjs.mod.Root]
  @scala.inline
  def loadSync(filename: java.lang.String, root: typingsSlinky.apolloProtobufjs.mod.Root): typingsSlinky.apolloProtobufjs.mod.Root = (typingsSlinky.apolloProtobufjs.lightMod.^.asInstanceOf[js.Dynamic].applyDynamic("loadSync")(filename.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.apolloProtobufjs.mod.Root]
  @scala.inline
  def loadSync(filename: js.Array[java.lang.String]): typingsSlinky.apolloProtobufjs.mod.Root = typingsSlinky.apolloProtobufjs.lightMod.^.asInstanceOf[js.Dynamic].applyDynamic("loadSync")(filename.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.apolloProtobufjs.mod.Root]
  @scala.inline
  def loadSync(filename: js.Array[java.lang.String], root: typingsSlinky.apolloProtobufjs.mod.Root): typingsSlinky.apolloProtobufjs.mod.Root = (typingsSlinky.apolloProtobufjs.lightMod.^.asInstanceOf[js.Dynamic].applyDynamic("loadSync")(filename.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.apolloProtobufjs.mod.Root]
  
  @scala.inline
  def parse(source: java.lang.String): typingsSlinky.apolloProtobufjs.mod.IParserResult = typingsSlinky.apolloProtobufjs.lightMod.^.asInstanceOf[js.Dynamic].applyDynamic("parse")(source.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.apolloProtobufjs.mod.IParserResult]
  @scala.inline
  def parse(source: java.lang.String, options: typingsSlinky.apolloProtobufjs.mod.IParseOptions): typingsSlinky.apolloProtobufjs.mod.IParserResult = (typingsSlinky.apolloProtobufjs.lightMod.^.asInstanceOf[js.Dynamic].applyDynamic("parse")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.apolloProtobufjs.mod.IParserResult]
  @scala.inline
  def parse(source: java.lang.String, root: typingsSlinky.apolloProtobufjs.mod.Root): typingsSlinky.apolloProtobufjs.mod.IParserResult = (typingsSlinky.apolloProtobufjs.lightMod.^.asInstanceOf[js.Dynamic].applyDynamic("parse")(source.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.apolloProtobufjs.mod.IParserResult]
  @scala.inline
  def parse(
    source: java.lang.String,
    root: typingsSlinky.apolloProtobufjs.mod.Root,
    options: typingsSlinky.apolloProtobufjs.mod.IParseOptions
  ): typingsSlinky.apolloProtobufjs.mod.IParserResult = (typingsSlinky.apolloProtobufjs.lightMod.^.asInstanceOf[js.Dynamic].applyDynamic("parse")(source.asInstanceOf[js.Any], root.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.apolloProtobufjs.mod.IParserResult]
  
  @scala.inline
  def verifier(mtype: typingsSlinky.apolloProtobufjs.mod.Type): typingsSlinky.apolloProtobufjs.mod.Codegen = typingsSlinky.apolloProtobufjs.lightMod.^.asInstanceOf[js.Dynamic].applyDynamic("verifier")(mtype.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.apolloProtobufjs.mod.Codegen]
}
