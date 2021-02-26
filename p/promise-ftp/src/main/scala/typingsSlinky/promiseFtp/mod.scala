package typingsSlinky.promiseFtp

import typingsSlinky.ftp.mod.ListingElement
import typingsSlinky.ftp.mod.Options
import typingsSlinky.node.Buffer
import typingsSlinky.node.NodeJS.ReadableStream
import typingsSlinky.promiseFtp.anon.Code
import typingsSlinky.promiseFtp.promiseFtpStrings.`Bad sequence of commands`
import typingsSlinky.promiseFtp.promiseFtpStrings.`CanApostrophet open data connection`
import typingsSlinky.promiseFtp.promiseFtpStrings.`Command not implemented for that parameter`
import typingsSlinky.promiseFtp.promiseFtpStrings.`Command not implemented`
import typingsSlinky.promiseFtp.promiseFtpStrings.`Connection closedComma transfer aborted`
import typingsSlinky.promiseFtp.promiseFtpStrings.`Need account for storing files`
import typingsSlinky.promiseFtp.promiseFtpStrings.`Not logged in`
import typingsSlinky.promiseFtp.promiseFtpStrings.`Requested action abortedColon local error in processing`
import typingsSlinky.promiseFtp.promiseFtpStrings.`Requested action abortedColon page type unknown`
import typingsSlinky.promiseFtp.promiseFtpStrings.`Requested action not taken Slash File name not allowed`
import typingsSlinky.promiseFtp.promiseFtpStrings.`Requested action not taken Slash File unavailable LeftparenthesiseDotgDotComma file not foundComma no accessRightparenthesis`
import typingsSlinky.promiseFtp.promiseFtpStrings.`Requested action not taken Slash Insufficient storage space in system`
import typingsSlinky.promiseFtp.promiseFtpStrings.`Requested file action aborted Slash Exceeded storage allocation Leftparenthesisfor current directory or datasetRightparenthesis`
import typingsSlinky.promiseFtp.promiseFtpStrings.`Requested file action not taken Slash File unavailable LeftparenthesiseDotgDotComma file busyRightparenthesis`
import typingsSlinky.promiseFtp.promiseFtpStrings.`Service not availableComma closing control connection`
import typingsSlinky.promiseFtp.promiseFtpStrings.`Syntax error Slash Command unrecognized`
import typingsSlinky.promiseFtp.promiseFtpStrings.`Syntax error in parameters or arguments`
import typingsSlinky.promiseFtpCommon.mod.STATUSES
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("promise-ftp", JSImport.Namespace)
  @js.native
  class ^ () extends PromiseFtp
  
  @js.native
  trait ERROR_CODES extends StObject {
    
    var `421`: `Service not availableComma closing control connection` = js.native
    
    var `425`: `CanApostrophet open data connection` = js.native
    
    var `426`: `Connection closedComma transfer aborted` = js.native
    
    var `450`: `Requested file action not taken Slash File unavailable LeftparenthesiseDotgDotComma file busyRightparenthesis` = js.native
    
    var `451`: `Requested action abortedColon local error in processing` = js.native
    
    var `452`: `Requested action not taken Slash Insufficient storage space in system` = js.native
    
    var `500`: `Syntax error Slash Command unrecognized` = js.native
    
    var `501`: `Syntax error in parameters or arguments` = js.native
    
    var `502`: `Command not implemented` = js.native
    
    var `503`: `Bad sequence of commands` = js.native
    
    var `504`: `Command not implemented for that parameter` = js.native
    
    var `530`: `Not logged in` = js.native
    
    var `532`: `Need account for storing files` = js.native
    
    var `550`: `Requested action not taken Slash File unavailable LeftparenthesiseDotgDotComma file not foundComma no accessRightparenthesis` = js.native
    
    var `551`: `Requested action abortedColon page type unknown` = js.native
    
    var `552`: `Requested file action aborted Slash Exceeded storage allocation Leftparenthesisfor current directory or datasetRightparenthesis` = js.native
    
    var `553`: `Requested action not taken Slash File name not allowed` = js.native
  }
  object ERROR_CODES {
    
    @JSImport("promise-ftp", "ERROR_CODES")
    @js.native
    val ^ : ERROR_CODES = js.native
    
    @scala.inline
    implicit class ERROR_CODESMutableBuilder[Self <: ERROR_CODES] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set421(value: `Service not availableComma closing control connection`): Self = StObject.set(x, "421", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set425(value: `CanApostrophet open data connection`): Self = StObject.set(x, "425", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set426(value: `Connection closedComma transfer aborted`): Self = StObject.set(x, "426", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set450(
        value: `Requested file action not taken Slash File unavailable LeftparenthesiseDotgDotComma file busyRightparenthesis`
      ): Self = StObject.set(x, "450", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set451(value: `Requested action abortedColon local error in processing`): Self = StObject.set(x, "451", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set452(value: `Requested action not taken Slash Insufficient storage space in system`): Self = StObject.set(x, "452", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set500(value: `Syntax error Slash Command unrecognized`): Self = StObject.set(x, "500", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set501(value: `Syntax error in parameters or arguments`): Self = StObject.set(x, "501", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set502(value: `Command not implemented`): Self = StObject.set(x, "502", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set503(value: `Bad sequence of commands`): Self = StObject.set(x, "503", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set504(value: `Command not implemented for that parameter`): Self = StObject.set(x, "504", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set530(value: `Not logged in`): Self = StObject.set(x, "530", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set532(value: `Need account for storing files`): Self = StObject.set(x, "532", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set550(
        value: `Requested action not taken Slash File unavailable LeftparenthesiseDotgDotComma file not foundComma no accessRightparenthesis`
      ): Self = StObject.set(x, "550", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set551(value: `Requested action abortedColon page type unknown`): Self = StObject.set(x, "551", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set552(
        value: `Requested file action aborted Slash Exceeded storage allocation Leftparenthesisfor current directory or datasetRightparenthesis`
      ): Self = StObject.set(x, "552", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set553(value: `Requested action not taken Slash File name not allowed`): Self = StObject.set(x, "553", value.asInstanceOf[js.Any])
    }
  }
  
  @JSImport("promise-ftp", "FtpConnectionError")
  @js.native
  class FtpConnectionError ()
    extends typingsSlinky.promiseFtpCommon.mod.FtpConnectionError
  
  @JSImport("promise-ftp", "FtpReconnectError")
  @js.native
  class FtpReconnectError ()
    extends typingsSlinky.promiseFtpCommon.mod.FtpReconnectError {
    def this(disconnectError: String) = this()
    def this(disconnectError: js.Error) = this()
    def this(disconnectError: js.UndefOr[scala.Nothing], connectError: String) = this()
    def this(disconnectError: js.UndefOr[scala.Nothing], connectError: js.Error) = this()
    def this(disconnectError: String, connectError: String) = this()
    def this(disconnectError: String, connectError: js.Error) = this()
    def this(disconnectError: js.Error, connectError: String) = this()
    def this(disconnectError: js.Error, connectError: js.Error) = this()
    def this(
      disconnectError: js.UndefOr[scala.Nothing],
      connectError: js.UndefOr[scala.Nothing],
      onCwd: Boolean
    ) = this()
    def this(disconnectError: js.UndefOr[scala.Nothing], connectError: String, onCwd: Boolean) = this()
    def this(disconnectError: js.UndefOr[scala.Nothing], connectError: js.Error, onCwd: Boolean) = this()
    def this(disconnectError: String, connectError: js.UndefOr[scala.Nothing], onCwd: Boolean) = this()
    def this(disconnectError: String, connectError: String, onCwd: Boolean) = this()
    def this(disconnectError: String, connectError: js.Error, onCwd: Boolean) = this()
    def this(disconnectError: js.Error, connectError: js.UndefOr[scala.Nothing], onCwd: Boolean) = this()
    def this(disconnectError: js.Error, connectError: String, onCwd: Boolean) = this()
    def this(disconnectError: js.Error, connectError: js.Error, onCwd: Boolean) = this()
  }
  
  @JSImport("promise-ftp", "STATUSES")
  @js.native
  object STATUSES extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.promiseFtpCommon.mod.STATUSES with String] = js.native
    
    /* "connected" */ val CONNECTED: typingsSlinky.promiseFtpCommon.mod.STATUSES.CONNECTED with String = js.native
    
    /* "connecting" */ val CONNECTING: typingsSlinky.promiseFtpCommon.mod.STATUSES.CONNECTING with String = js.native
    
    /* "disconnected" */ val DISCONNECTED: typingsSlinky.promiseFtpCommon.mod.STATUSES.DISCONNECTED with String = js.native
    
    /* "disconnecting" */ val DISCONNECTING: typingsSlinky.promiseFtpCommon.mod.STATUSES.DISCONNECTING with String = js.native
    
    /* "logging out" */ val LOGGING_OUT: typingsSlinky.promiseFtpCommon.mod.STATUSES.LOGGING_OUT with String = js.native
    
    /* "not yet connected" */ val NOT_YET_CONNECTED: typingsSlinky.promiseFtpCommon.mod.STATUSES.NOT_YET_CONNECTED with String = js.native
    
    /* "reconnecting" */ val RECONNECTING: typingsSlinky.promiseFtpCommon.mod.STATUSES.RECONNECTING with String = js.native
  }
  
  @js.native
  trait PromiseFtp extends StObject {
    
    /**
      * Abort the current data transfer (e.g. from `#get()`, `#put()`, or `#list()`)
      */
    def abort(): typingsSlinky.bluebird.mod.^[Unit] = js.native
    
    def append(input: String, destPath: String): typingsSlinky.bluebird.mod.^[Unit] = js.native
    def append(input: String, destPath: String, useCompression: Boolean): typingsSlinky.bluebird.mod.^[Unit] = js.native
    def append(input: Buffer, destPath: String): typingsSlinky.bluebird.mod.^[Unit] = js.native
    def append(input: Buffer, destPath: String, useCompression: Boolean): typingsSlinky.bluebird.mod.^[Unit] = js.native
    /**
      * Create a new file on the server or append to one that already exists.
      * @param input - can be a ReadableStream, a Buffer, or a pathto a local file.
      * @param destPath - the path of the file to create or append to.
      * @param useCompression - defaults to false.
      */
    def append(input: ReadableStream, destPath: String): typingsSlinky.bluebird.mod.^[Unit] = js.native
    def append(input: ReadableStream, destPath: String, useCompression: Boolean): typingsSlinky.bluebird.mod.^[Unit] = js.native
    
    /**
      * Set the transfer data type to ASCII.
      */
    def ascii(): typingsSlinky.bluebird.mod.^[Unit] = js.native
    
    /**
      * Set the transfer data type to binary (default at time of connection).
      */
    def binary(): typingsSlinky.bluebird.mod.^[Unit] = js.native
    
    /**
      * Optional "standard" commands (RFC 959)
      * Change the working directory to the parent of the current directory.
      * Like `cd ..`.
      */
    def cdup(): typingsSlinky.bluebird.mod.^[Unit] = js.native
    
    /**
      * Connect to an FTP server.
      */
    def connect(options: Options): typingsSlinky.bluebird.mod.^[String] = js.native
    
    /**
      * Change the current working directory.
      * @param cwd - the path to change the CWD to.
      * @returns the current directory if the server replies with the path in the
      * response text, otherwise undefined.
      */
    def cwd(path: String): typingsSlinky.bluebird.mod.^[js.UndefOr[String]] = js.native
    
    /**
      * Delete a file on the server.
      */
    def delete(path: String): typingsSlinky.bluebird.mod.^[Unit] = js.native
    
    /**
      * Close the connection to the server immediately.
      */
    def destroy(): Boolean = js.native
    
    /**
      * Close the connection to the server after any/all enqueued
      * commands have been executed.
      * @returns a promise that resolves with the last error recieved if there
      * was an error, true if there was an error but the client didn't recieve it,
      * or false if there was no error.
      */
    def end(): typingsSlinky.bluebird.mod.^[js.Error | Boolean] = js.native
    
    /**
      * Retrieve a file at path from the server.
      * @param path - the path of the file to get.
      * @param useCompression - defaults to false.
      * @returns a stream which empties to the contents of the specified file.
      */
    def get(path: String): typingsSlinky.bluebird.mod.^[ReadableStream] = js.native
    def get(path: String, useCompression: Boolean): typingsSlinky.bluebird.mod.^[ReadableStream] = js.native
    
    def getConnectionStatus(): STATUSES = js.native
    
    /**
      * Extended commands (RFC 3659)
      * Retrieve the last modified date and time for a file or directory.
      * @param path - the path of the file/directory whose modified date is to
      * be retrieved.
      * @returns the last modified date at the specified path.
      */
    def lastMod(path: String): typingsSlinky.bluebird.mod.^[js.Date] = js.native
    
    /**
      * Retrieve the directory listing of path.
      * @param path - defaults to the current working directory.
      * @param useCompression - defaults to false.
      * @returns the contents of the specified directory
      */
    def list(): typingsSlinky.bluebird.mod.^[js.Array[ListingElement | String]] = js.native
    def list(path: js.UndefOr[scala.Nothing], useCompression: Boolean): typingsSlinky.bluebird.mod.^[js.Array[ListingElement | String]] = js.native
    def list(path: String): typingsSlinky.bluebird.mod.^[js.Array[ListingElement | String]] = js.native
    def list(path: String, useCompression: Boolean): typingsSlinky.bluebird.mod.^[js.Array[ListingElement | String]] = js.native
    def list(useCompression: Boolean): typingsSlinky.bluebird.mod.^[js.Array[ListingElement | String]] = js.native
    
    /**
      * Optional "standard" commands (RFC 959)
      * Retrieve the directory listing of path.
      * Similar to `#list()`, except the directory is temporarily changed to path to
      * retrieve the directory listing. This is useful for servers that do not
      * handle characters like spaces and quotes in directory names well for the
      * LIST command. This function is "optional" because it relies on `#pwd()`
      * being available.
      * @param path - defaults to the current working directory.
      * @param useCompression - defaults to false.
      * @returns the contents of the specified directory
      */
    def listSafe(): typingsSlinky.bluebird.mod.^[js.Array[ListingElement | String]] = js.native
    def listSafe(path: js.UndefOr[scala.Nothing], useCompression: Boolean): typingsSlinky.bluebird.mod.^[js.Array[ListingElement | String]] = js.native
    def listSafe(path: String): typingsSlinky.bluebird.mod.^[js.Array[ListingElement | String]] = js.native
    def listSafe(path: String, useCompression: Boolean): typingsSlinky.bluebird.mod.^[js.Array[ListingElement | String]] = js.native
    def listSafe(useCompression: Boolean): typingsSlinky.bluebird.mod.^[js.Array[ListingElement | String]] = js.native
    
    /**
      * Logout the user from the server.
      */
    def logout(): typingsSlinky.bluebird.mod.^[Unit] = js.native
    
    /**
      * Optional "standard" commands (RFC 959)
      * Create a new directory on the server.
      * @param path - the path of the new directory.
      * @param recursive - enables a `mkdir -p` algorithm, defaults to false.
      */
    def mkdir(path: String): typingsSlinky.bluebird.mod.^[Unit] = js.native
    def mkdir(path: String, recursive: Boolean): typingsSlinky.bluebird.mod.^[Unit] = js.native
    
    def put(input: String, destPath: String): typingsSlinky.bluebird.mod.^[Unit] = js.native
    def put(input: String, destPath: String, useCompression: Boolean): typingsSlinky.bluebird.mod.^[Unit] = js.native
    def put(input: Buffer, destPath: String): typingsSlinky.bluebird.mod.^[Unit] = js.native
    def put(input: Buffer, destPath: String, useCompression: Boolean): typingsSlinky.bluebird.mod.^[Unit] = js.native
    /**
      * Send data to the server to be stored as a file.
      * @param input - can be a ReadableStream, a Buffer, or a path to a local file.
      * @param destPath - the path of the file to write to.
      * @param useCompression - defaults to false.
      */
    def put(input: ReadableStream, destPath: String): typingsSlinky.bluebird.mod.^[Unit] = js.native
    def put(input: ReadableStream, destPath: String, useCompression: Boolean): typingsSlinky.bluebird.mod.^[Unit] = js.native
    
    /**
      * Optional "standard" commands (RFC 959)
      * Retrieve the current working directory.
      */
    def pwd(): typingsSlinky.bluebird.mod.^[String] = js.native
    
    /**
      * The underlying FtpClient instance
      */
    var rawClient: typingsSlinky.ftp.mod.^ = js.native
    
    /**
      * Reconnect with the same options as previously connected with `#connect()`.
      */
    def reconnect(): typingsSlinky.bluebird.mod.^[String] = js.native
    
    /**
      * Rename a file on the server.
      * @param oldPath - the old path of the file.
      * @param newPath - the new path to move it to.
      */
    def rename(oldPath: String, newPath: String): typingsSlinky.bluebird.mod.^[Unit] = js.native
    
    /**
      * Extended commands (RFC 3659)
      * Set the file byte offset for the next file transfer action (get/put).
      * @param byteOffset - The file byte offset.
      */
    def restart(byteOffset: Double): typingsSlinky.bluebird.mod.^[Unit] = js.native
    
    /**
      * Optional "standard" commands (RFC 959)
      * Remove a directory on the server.
      * @param path - the path of the directory to remove.
      * @param recursive - enables deleting the directory if not empty, defaults to false.
      */
    def rmdir(path: String): typingsSlinky.bluebird.mod.^[Unit] = js.native
    def rmdir(path: String, recursive: Boolean): typingsSlinky.bluebird.mod.^[Unit] = js.native
    
    /**
      * Send command using SITE.
      * @param command - the command to send, e.g 'CHMOD 755 foo' or 'QUOTA'.
      */
    def site(command: String): typingsSlinky.bluebird.mod.^[Code] = js.native
    
    /**
      * Extended commands (RFC 3659)
      * Retrieve the size of a file on the server.
      * @param path - the path of the file whose size is to be retrieved.
      * @returns the size of the specified file.
      */
    def size(path: String): typingsSlinky.bluebird.mod.^[Double] = js.native
    
    /**
      * Retrieve human-readable information about the server's status.
      * @returns a string with the server's status.
      */
    def status(): typingsSlinky.bluebird.mod.^[String] = js.native
    
    /**
      * Optional "standard" commands (RFC 959)
      * Retrieve information about the system running the server.
      * @returns the server's OS.
      */
    def system(): typingsSlinky.bluebird.mod.^[String] = js.native
  }
}
