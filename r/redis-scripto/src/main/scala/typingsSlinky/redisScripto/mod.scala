package typingsSlinky.redisScripto

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.redis.mod.RedisClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("redis-scripto", JSImport.Namespace)
  @js.native
  class ^ protected () extends Scripto {
    def this(redisClient: RedisClient) = this()
  }
  
  type Script = String
  
  @js.native
  trait Scripto extends StObject {
    
    def eval(
      scriptName: String,
      keys: js.Array[String],
      args: js.Array[_],
      callback: js.Function2[/* err */ js.Error, /* result */ js.Any, Unit]
    ): Unit = js.native
    
    def evalSha(
      scriptName: String,
      keys: js.Array[String],
      args: js.Array[_],
      callback: js.Function2[/* err */ js.Error, /* result */ js.Any, Unit]
    ): Unit = js.native
    
    def load(scripts: Scripts): Unit = js.native
    
    def loadFromDir(scriptsDir: String): Unit = js.native
    
    def loadFromFile(name: String, filepath: String): Unit = js.native
    
    def run(
      scriptName: String,
      keys: js.Array[String],
      args: js.Array[_],
      callback: js.Function2[/* err */ js.Error, /* result */ js.Any, Unit]
    ): Unit = js.native
  }
  object Scripto {
    
    @scala.inline
    def apply(
      eval: (String, js.Array[String], js.Array[_], js.Function2[/* err */ js.Error, /* result */ js.Any, Unit]) => Unit,
      evalSha: (String, js.Array[String], js.Array[_], js.Function2[/* err */ js.Error, /* result */ js.Any, Unit]) => Unit,
      load: Scripts => Unit,
      loadFromDir: String => Unit,
      loadFromFile: (String, String) => Unit,
      run: (String, js.Array[String], js.Array[_], js.Function2[/* err */ js.Error, /* result */ js.Any, Unit]) => Unit
    ): Scripto = {
      val __obj = js.Dynamic.literal(eval = js.Any.fromFunction4(eval), evalSha = js.Any.fromFunction4(evalSha), load = js.Any.fromFunction1(load), loadFromDir = js.Any.fromFunction1(loadFromDir), loadFromFile = js.Any.fromFunction2(loadFromFile), run = js.Any.fromFunction4(run))
      __obj.asInstanceOf[Scripto]
    }
    
    @scala.inline
    implicit class ScriptoMutableBuilder[Self <: Scripto] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEval(
        value: (String, js.Array[String], js.Array[_], js.Function2[/* err */ js.Error, /* result */ js.Any, Unit]) => Unit
      ): Self = StObject.set(x, "eval", js.Any.fromFunction4(value))
      
      @scala.inline
      def setEvalSha(
        value: (String, js.Array[String], js.Array[_], js.Function2[/* err */ js.Error, /* result */ js.Any, Unit]) => Unit
      ): Self = StObject.set(x, "evalSha", js.Any.fromFunction4(value))
      
      @scala.inline
      def setLoad(value: Scripts => Unit): Self = StObject.set(x, "load", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLoadFromDir(value: String => Unit): Self = StObject.set(x, "loadFromDir", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLoadFromFile(value: (String, String) => Unit): Self = StObject.set(x, "loadFromFile", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRun(
        value: (String, js.Array[String], js.Array[_], js.Function2[/* err */ js.Error, /* result */ js.Any, Unit]) => Unit
      ): Self = StObject.set(x, "run", js.Any.fromFunction4(value))
    }
  }
  
  type Scripts = StringDictionary[Script]
}
