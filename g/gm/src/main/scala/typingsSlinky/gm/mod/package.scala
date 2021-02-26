package typingsSlinky.gm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  @scala.inline
  def apply(stream: java.lang.String): typingsSlinky.gm.mod.State = typingsSlinky.gm.mod.^.asInstanceOf[js.Dynamic].apply(stream.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.gm.mod.State]
  @scala.inline
  def apply(stream: java.lang.String, image: java.lang.String): typingsSlinky.gm.mod.State = (typingsSlinky.gm.mod.^.asInstanceOf[js.Dynamic].apply(stream.asInstanceOf[js.Any], image.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.gm.mod.State]
  @scala.inline
  def apply(stream: typingsSlinky.node.Buffer): typingsSlinky.gm.mod.State = typingsSlinky.gm.mod.^.asInstanceOf[js.Dynamic].apply(stream.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.gm.mod.State]
  @scala.inline
  def apply(stream: typingsSlinky.node.Buffer, image: java.lang.String): typingsSlinky.gm.mod.State = (typingsSlinky.gm.mod.^.asInstanceOf[js.Dynamic].apply(stream.asInstanceOf[js.Any], image.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.gm.mod.State]
  @scala.inline
  def apply(stream: typingsSlinky.node.NodeJS.ReadableStream): typingsSlinky.gm.mod.State = typingsSlinky.gm.mod.^.asInstanceOf[js.Dynamic].apply(stream.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.gm.mod.State]
  @scala.inline
  def apply(stream: typingsSlinky.node.NodeJS.ReadableStream, image: java.lang.String): typingsSlinky.gm.mod.State = (typingsSlinky.gm.mod.^.asInstanceOf[js.Dynamic].apply(stream.asInstanceOf[js.Any], image.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.gm.mod.State]
  @scala.inline
  def apply(width: scala.Double, height: scala.Double): typingsSlinky.gm.mod.State = (typingsSlinky.gm.mod.^.asInstanceOf[js.Dynamic].apply(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.gm.mod.State]
  @scala.inline
  def apply(width: scala.Double, height: scala.Double, color: java.lang.String): typingsSlinky.gm.mod.State = (typingsSlinky.gm.mod.^.asInstanceOf[js.Dynamic].apply(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.gm.mod.State]
  
  type CompareCallback = js.Function4[
    /* err */ js.Error | scala.Null, 
    /* isEqual */ scala.Boolean, 
    /* equality */ scala.Double, 
    /* raw */ scala.Double, 
    js.Any
  ]
  
  type GetterCallback[T] = js.Function2[/* err */ js.Error | scala.Null, /* value */ T, js.Any]
  
  type WriteCallback = js.Function4[
    /* err */ js.Error | scala.Null, 
    /* stdout */ typingsSlinky.node.streamMod.Readable, 
    /* stderr */ typingsSlinky.node.streamMod.Readable, 
    /* cmd */ java.lang.String, 
    js.Any
  ]
  
  @scala.inline
  def compare(
    filename1: java.lang.String,
    filename2: java.lang.String,
    callback: typingsSlinky.gm.mod.CompareCallback
  ): scala.Unit = (typingsSlinky.gm.mod.^.asInstanceOf[js.Dynamic].applyDynamic("compare")(filename1.asInstanceOf[js.Any], filename2.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def compare(
    filename1: java.lang.String,
    filename2: java.lang.String,
    options: scala.Double,
    callback: typingsSlinky.gm.mod.CompareCallback
  ): scala.Unit = (typingsSlinky.gm.mod.^.asInstanceOf[js.Dynamic].applyDynamic("compare")(filename1.asInstanceOf[js.Any], filename2.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def compare(
    filename1: java.lang.String,
    filename2: java.lang.String,
    options: typingsSlinky.gm.mod.CompareOptions,
    callback: typingsSlinky.gm.mod.CompareCallback
  ): scala.Unit = (typingsSlinky.gm.mod.^.asInstanceOf[js.Dynamic].applyDynamic("compare")(filename1.asInstanceOf[js.Any], filename2.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def subClass(options: typingsSlinky.gm.mod.ClassOptions): typingsSlinky.gm.mod.SubClass_ = typingsSlinky.gm.mod.^.asInstanceOf[js.Dynamic].applyDynamic("subClass")(options.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.gm.mod.SubClass_]
}
