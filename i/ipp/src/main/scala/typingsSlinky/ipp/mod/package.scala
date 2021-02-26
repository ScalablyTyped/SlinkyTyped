package typingsSlinky.ipp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Resolution = js.Tuple3[scala.Double, scala.Double, java.lang.String]
  
  @scala.inline
  def attribute: js.Object = typingsSlinky.ipp.mod.^.asInstanceOf[js.Dynamic].selectDynamic("attribute").asInstanceOf[js.Object]
  
  @scala.inline
  def attributes: js.Object = typingsSlinky.ipp.mod.^.asInstanceOf[js.Dynamic].selectDynamic("attributes").asInstanceOf[js.Object]
  
  @scala.inline
  def enums: js.Object = typingsSlinky.ipp.mod.^.asInstanceOf[js.Dynamic].selectDynamic("enums").asInstanceOf[js.Object]
  
  @scala.inline
  def keywords: js.Object = typingsSlinky.ipp.mod.^.asInstanceOf[js.Dynamic].selectDynamic("keywords").asInstanceOf[js.Object]
  
  @scala.inline
  def operations: js.Object = typingsSlinky.ipp.mod.^.asInstanceOf[js.Dynamic].selectDynamic("operations").asInstanceOf[js.Object]
  
  @scala.inline
  def parse(buf: typingsSlinky.node.Buffer): typingsSlinky.ipp.mod.ParsedBuffer = typingsSlinky.ipp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parse")(buf.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.ipp.mod.ParsedBuffer]
  
  @scala.inline
  def request(
    opts: java.lang.String,
    buffer: typingsSlinky.node.Buffer,
    cb: js.Function2[
      /* error */ js.Error | scala.Null, 
      /* response */ typingsSlinky.ipp.mod.ParsedBuffer, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.ipp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("request")(opts.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def request(
    opts: typingsSlinky.node.urlMod.UrlWithStringQuery,
    buffer: typingsSlinky.node.Buffer,
    cb: js.Function2[
      /* error */ js.Error | scala.Null, 
      /* response */ typingsSlinky.ipp.mod.ParsedBuffer, 
      scala.Unit
    ]
  ): scala.Unit = (typingsSlinky.ipp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("request")(opts.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def serialize(msg: js.Object): typingsSlinky.node.Buffer = typingsSlinky.ipp.mod.^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(msg.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.node.Buffer]
  
  @scala.inline
  def statusCodes: js.Object = typingsSlinky.ipp.mod.^.asInstanceOf[js.Dynamic].selectDynamic("statusCodes").asInstanceOf[js.Object]
  
  @scala.inline
  def tags: js.Object = typingsSlinky.ipp.mod.^.asInstanceOf[js.Dynamic].selectDynamic("tags").asInstanceOf[js.Object]
  
  @scala.inline
  def versions: js.Object = typingsSlinky.ipp.mod.^.asInstanceOf[js.Dynamic].selectDynamic("versions").asInstanceOf[js.Object]
}
