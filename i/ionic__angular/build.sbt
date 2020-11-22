organization := "org.scalablytyped.slinky"
name := "ionic__angular"
version := "5.5.0-225c6a"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "angular__common" % "11.0.2-3ba406",
  "org.scalablytyped.slinky" %%% "angular__compiler" % "11.0.2-660a27",
  "org.scalablytyped.slinky" %%% "angular__core" % "11.0.2-77d222",
  "org.scalablytyped.slinky" %%% "angular__forms" % "11.0.2-5ac647",
  "org.scalablytyped.slinky" %%% "angular__router" % "11.0.2-f9b99d",
  "org.scalablytyped.slinky" %%% "inquirer" % "7.3-dt-20200820Z-dd25f1",
  "org.scalablytyped.slinky" %%% "ionic__core" % "5.5.0-f4a631",
  "org.scalablytyped.slinky" %%% "ionicons" % "5.2.3-599384",
  "org.scalablytyped.slinky" %%% "node" % "14.14-dt-20201119Z-b1b1c0",
  "org.scalablytyped.slinky" %%% "rxjs" % "6.6.3-d2f269",
  "org.scalablytyped.slinky" %%% "rxjs-compat" % "6.6.3-6703be",
  "org.scalablytyped.slinky" %%% "std" % "4.1-e01533",
  "org.scalablytyped.slinky" %%% "swiper" % "5.4-dt-20201028Z-55f01f",
  "org.scalablytyped.slinky" %%% "through" % "0.0-unknown-dt-20201002Z-ca33b3",
  "org.scalablytyped.slinky" %%% "typescript" % "4.1.2-27142e")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
