organization := "org.scalablytyped.slinky"
name := "instagram-private-api"
version := "1.40.1-63858d"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "bluebird" % "3.5-dt-20200520Z-6ce100",
  "org.scalablytyped.slinky" %%% "caseless" % "0.12-dt-20200515Z-1a0aa4",
  "org.scalablytyped.slinky" %%% "chance" % "1.1-dt-20200515Z-be5adb",
  "org.scalablytyped.slinky" %%% "form-data" % "2.5.1-cb3aa6",
  "org.scalablytyped.slinky" %%% "lifeomic__attempt" % "3.0.0-159b07",
  "org.scalablytyped.slinky" %%% "luxon" % "1.24-dt-20200515Z-264d75",
  "org.scalablytyped.slinky" %%% "node" % "14.0-dt-20200519Z-fa178d",
  "org.scalablytyped.slinky" %%% "request" % "2.48-dt-20200515Z-b47420",
  "org.scalablytyped.slinky" %%% "rxjs" % "6.5.5-a158f0",
  "org.scalablytyped.slinky" %%% "rxjs-compat" % "6.5.5-1d035b",
  "org.scalablytyped.slinky" %%% "std" % "3.9-c21af0",
  "org.scalablytyped.slinky" %%% "tough-cookie" % "4.0-dt-20200515Z-6402f6",
  "org.scalablytyped.slinky" %%% "ts-custom-error" % "2.2.2-cd2876",
  "org.scalablytyped.slinky" %%% "ts-xor" % "1.0.8-b05ba1",
  "org.scalablytyped.slinky" %%% "utility-types" % "2.1.0-04db0f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
