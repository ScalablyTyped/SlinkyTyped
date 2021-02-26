package typingsSlinky.doctrine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  @scala.inline
  def parse(content: java.lang.String): typingsSlinky.doctrine.mod.Annotation = typingsSlinky.doctrine.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parse")(content.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.doctrine.mod.Annotation]
  @scala.inline
  def parse(content: java.lang.String, options: typingsSlinky.doctrine.mod.Options): typingsSlinky.doctrine.mod.Annotation = (typingsSlinky.doctrine.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parse")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.doctrine.mod.Annotation]
  
  @scala.inline
  def parseParamType: js.Function2[
    /* src */ java.lang.String, 
    /* options */ js.UndefOr[typingsSlinky.doctrine.anon.Midstream], 
    typingsSlinky.doctrine.mod.Type_
  ] = typingsSlinky.doctrine.mod.^.asInstanceOf[js.Dynamic].selectDynamic("parseParamType").asInstanceOf[js.Function2[
    /* src */ java.lang.String, 
    /* options */ js.UndefOr[typingsSlinky.doctrine.anon.Midstream], 
    typingsSlinky.doctrine.mod.Type_
  ]]
  
  @scala.inline
  def parseType: js.Function2[
    /* src */ java.lang.String, 
    /* options */ js.UndefOr[typingsSlinky.doctrine.anon.Midstream], 
    typingsSlinky.doctrine.mod.Type_
  ] = typingsSlinky.doctrine.mod.^.asInstanceOf[js.Dynamic].selectDynamic("parseType").asInstanceOf[js.Function2[
    /* src */ java.lang.String, 
    /* options */ js.UndefOr[typingsSlinky.doctrine.anon.Midstream], 
    typingsSlinky.doctrine.mod.Type_
  ]]
  
  @scala.inline
  def unwrapComment(doc: java.lang.String): java.lang.String = typingsSlinky.doctrine.mod.^.asInstanceOf[js.Dynamic].applyDynamic("unwrapComment")(doc.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  @scala.inline
  def version: java.lang.String = typingsSlinky.doctrine.mod.^.asInstanceOf[js.Dynamic].selectDynamic("version").asInstanceOf[java.lang.String]
}
