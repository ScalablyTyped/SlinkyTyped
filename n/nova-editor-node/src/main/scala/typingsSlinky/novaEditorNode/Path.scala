package typingsSlinky.novaEditorNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/// https://novadocs.panic.com/api-reference/path/
@js.native
trait Path extends StObject {
  
  def basename(path: String): String = js.native
  
  def dirname(path: String): String = js.native
  
  def expanduser(path: String): String = js.native
  
  def extname(path: String): String = js.native
  
  def isAbsolute(path: String): Boolean = js.native
  
  def join(paths: String*): String = js.native
  
  def normalize(path: String): String = js.native
  
  def split(path: String): js.Array[String] = js.native
  
  def splitext(path: String): js.Tuple2[String, String] = js.native
}
object Path {
  
  @scala.inline
  def apply(
    basename: String => String,
    dirname: String => String,
    expanduser: String => String,
    extname: String => String,
    isAbsolute: String => Boolean,
    join: /* repeated */ String => String,
    normalize: String => String,
    split: String => js.Array[String],
    splitext: String => js.Tuple2[String, String]
  ): Path = {
    val __obj = js.Dynamic.literal(basename = js.Any.fromFunction1(basename), dirname = js.Any.fromFunction1(dirname), expanduser = js.Any.fromFunction1(expanduser), extname = js.Any.fromFunction1(extname), isAbsolute = js.Any.fromFunction1(isAbsolute), join = js.Any.fromFunction1(join), normalize = js.Any.fromFunction1(normalize), split = js.Any.fromFunction1(split), splitext = js.Any.fromFunction1(splitext))
    __obj.asInstanceOf[Path]
  }
  
  @scala.inline
  implicit class PathMutableBuilder[Self <: Path] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBasename(value: String => String): Self = StObject.set(x, "basename", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDirname(value: String => String): Self = StObject.set(x, "dirname", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExpanduser(value: String => String): Self = StObject.set(x, "expanduser", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExtname(value: String => String): Self = StObject.set(x, "extname", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsAbsolute(value: String => Boolean): Self = StObject.set(x, "isAbsolute", js.Any.fromFunction1(value))
    
    @scala.inline
    def setJoin(value: /* repeated */ String => String): Self = StObject.set(x, "join", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNormalize(value: String => String): Self = StObject.set(x, "normalize", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSplit(value: String => js.Array[String]): Self = StObject.set(x, "split", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSplitext(value: String => js.Tuple2[String, String]): Self = StObject.set(x, "splitext", js.Any.fromFunction1(value))
  }
}
