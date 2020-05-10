organization := "org.scalablytyped.slinky"
name := "instagram-private-api"
version := "1.39.1-f7e9a0"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "bluebird" % "3.5-dt-20200302Z-1b60d9",
  "org.scalablytyped.slinky" %%% "caseless" % "0.12-dt-20190311Z-e60433",
  "org.scalablytyped.slinky" %%% "chance" % "1.0-dt-20200402Z-5be536",
  "org.scalablytyped.slinky" %%% "form-data" % "2.5.1-8be79d",
  "org.scalablytyped.slinky" %%% "lifeomic__attempt" % "3.0.0-0618e5",
  "org.scalablytyped.slinky" %%% "luxon" % "1.22-dt-20200322Z-9af4e3",
  "org.scalablytyped.slinky" %%% "node" % "13.13-dt-20200426Z-6c3110",
  "org.scalablytyped.slinky" %%% "request" % "2.48-dt-20191217Z-afeb1e",
  "org.scalablytyped.slinky" %%% "rxjs" % "6.5.4-f7a9ee",
  "org.scalablytyped.slinky" %%% "rxjs-compat" % "6.5.4-484a39",
  "org.scalablytyped.slinky" %%% "std" % "3.8-8ac92e",
  "org.scalablytyped.slinky" %%% "tough-cookie" % "4.0-dt-20200331Z-c78280",
  "org.scalablytyped.slinky" %%% "ts-custom-error" % "2.2.2-92701f",
  "org.scalablytyped.slinky" %%% "ts-xor" % "1.0.8-0aa92d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
