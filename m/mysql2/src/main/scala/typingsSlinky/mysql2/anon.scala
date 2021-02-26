package typingsSlinky.mysql2

import typingsSlinky.mysql2.mod.Connection
import typingsSlinky.mysql2.mysql2Strings.Field
import typingsSlinky.mysql2.mysql2Strings.FieldPacket
import typingsSlinky.mysql2.mysql2Strings.OkPacket
import typingsSlinky.mysql2.mysql2Strings.ResultSetHeader
import typingsSlinky.mysql2.mysql2Strings.RowDataPacket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait `0` extends StObject {
    
    var name: FieldPacket = js.native
  }
  object `0` {
    
    @scala.inline
    def apply(name: FieldPacket): `0` = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[`0`]
    }
    
    @scala.inline
    implicit class `0MutableBuilder`[Self <: `0`] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: FieldPacket): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait `1` extends StObject {
    
    var name: OkPacket = js.native
  }
  object `1` {
    
    @scala.inline
    def apply(name: OkPacket): `1` = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[`1`]
    }
    
    @scala.inline
    implicit class `1MutableBuilder`[Self <: `1`] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: OkPacket): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait `2` extends StObject {
    
    var name: ResultSetHeader = js.native
  }
  object `2` {
    
    @scala.inline
    def apply(name: ResultSetHeader): `2` = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[`2`]
    }
    
    @scala.inline
    implicit class `2MutableBuilder`[Self <: `2`] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: ResultSetHeader): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait `3` extends StObject {
    
    var name: RowDataPacket = js.native
  }
  object `3` {
    
    @scala.inline
    def apply(name: RowDataPacket): `3` = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[`3`]
    }
    
    @scala.inline
    implicit class `3MutableBuilder`[Self <: `3`] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: RowDataPacket): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Command extends StObject {
    
    var command: String = js.native
    
    var connection: Connection = js.native
  }
  object Command {
    
    @scala.inline
    def apply(command: String, connection: Connection): Command = {
      val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], connection = connection.asInstanceOf[js.Any])
      __obj.asInstanceOf[Command]
    }
    
    @scala.inline
    implicit class CommandMutableBuilder[Self <: Command] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnection(value: Connection): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Name extends StObject {
    
    var name: Field = js.native
  }
  object Name {
    
    @scala.inline
    def apply(name: Field): Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    @scala.inline
    implicit class NameMutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: Field): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
