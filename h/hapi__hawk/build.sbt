organization := "org.scalablytyped.slinky"
name := "hapi__hawk"
version := "8.0-dt-20200122Z-b330fa"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "caseless" % "0.12-dt-20190311Z-e60433",
  "org.scalablytyped.slinky" %%% "crypto-js" % "v3.1.8-dt-20200427Z-5be7de",
  "org.scalablytyped.slinky" %%% "form-data" % "2.5.1-8be79d",
  "org.scalablytyped.slinky" %%% "hapi__boom" % "9.1.0-83f636",
  "org.scalablytyped.slinky" %%% "hapi__catbox" % "10.2-dt-20190521Z-7fcae0",
  "org.scalablytyped.slinky" %%% "hapi__hapi" % "19.0-dt-20200427Z-620616",
  "org.scalablytyped.slinky" %%% "hapi__iron" % "6.0.0-30f60b",
  "org.scalablytyped.slinky" %%% "hapi__joi" % "16.0-dt-20200225Z-2ba646",
  "org.scalablytyped.slinky" %%% "hapi__mimos" % "4.1-dt-20200424Z-4512cb",
  "org.scalablytyped.slinky" %%% "hapi__podium" % "3.4-dt-20200225Z-2fde04",
  "org.scalablytyped.slinky" %%% "hapi__shot" % "4.1-dt-20190404Z-582203",
  "org.scalablytyped.slinky" %%% "hapi__sntp" % "3.1-dt-20190425Z-7977bf",
  "org.scalablytyped.slinky" %%% "mime-db" % "1.43-dt-20200424Z-565e34",
  "org.scalablytyped.slinky" %%% "node" % "13.13-dt-20200426Z-6c3110",
  "org.scalablytyped.slinky" %%% "request" % "2.48-dt-20191217Z-afeb1e",
  "org.scalablytyped.slinky" %%% "std" % "3.8-8ac92e",
  "org.scalablytyped.slinky" %%% "tough-cookie" % "4.0-dt-20200331Z-c78280")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
