organization := "org.scalablytyped.slinky"
name := "instagram-private-api"
version := "1.39.1-1ee4f0"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "bluebird" % "3.5-dt-20200302Z-44c437",
  "org.scalablytyped.slinky" %%% "caseless" % "0.12-dt-20190311Z-061f1f",
  "org.scalablytyped.slinky" %%% "chance" % "1.0-dt-20200402Z-b4b14e",
  "org.scalablytyped.slinky" %%% "form-data" % "2.5.1-78ba56",
  "org.scalablytyped.slinky" %%% "lifeomic__attempt" % "3.0.0-3d2193",
  "org.scalablytyped.slinky" %%% "luxon" % "1.22-dt-20200322Z-a6328a",
  "org.scalablytyped.slinky" %%% "node" % "13.13-dt-20200426Z-9e8213",
  "org.scalablytyped.slinky" %%% "request" % "2.48-dt-20191217Z-282c0c",
  "org.scalablytyped.slinky" %%% "rxjs" % "6.5.4-e2a094",
  "org.scalablytyped.slinky" %%% "rxjs-compat" % "6.5.4-86bf9e",
  "org.scalablytyped.slinky" %%% "std" % "3.8-c726bb",
  "org.scalablytyped.slinky" %%% "tough-cookie" % "4.0-dt-20200331Z-154045",
  "org.scalablytyped.slinky" %%% "ts-custom-error" % "2.2.2-6c7b32",
  "org.scalablytyped.slinky" %%% "ts-xor" % "1.0.8-b5cdbd")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
